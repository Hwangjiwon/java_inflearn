package Networking_SandC_Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket s = null;

		OutputStream output = null;
		DataOutputStream dataOutput = null;

		InputStream input = null;
		DataInputStream dataInput = null;

		Scanner scanner = null;

		try {
			s = new Socket("localhost", 9000);
			System.out.println("Linked to server");
			System.out.println(s);

			output = s.getOutputStream();
			dataOutput = new DataOutputStream(output);

			input = s.getInputStream();
			dataInput = new DataInputStream(input);

			scanner = new Scanner(System.in); //user input

			while (true) {
				System.out.print("input: ");
				String outMsg = scanner.nextLine();
				dataOutput.writeUTF(outMsg);
				dataOutput.flush();

				String inMsg = dataInput.readUTF();
				System.out.println("inputMsg: " + inMsg);

				if (outMsg.equals("STOP"))
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (s != null)
					s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
