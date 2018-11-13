package Networking_SandC_Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		Socket s = null;

		InputStream input = null;
		DataInputStream dataInput = null;

		OutputStream output = null;
		DataOutputStream dataOutput = null;

		try {
			ss = new ServerSocket(9000);
			System.out.println("server ready");

			s = ss.accept();
			System.out.println("client linked");
			System.out.println(s);

			input = s.getInputStream();
			dataInput = new DataInputStream(input);

			output = s.getOutputStream();
			dataOutput = new DataOutputStream(output);

			while (true) {
				String clientMsg = dataInput.readUTF();
				System.out.println("clientMsg: " + clientMsg);

				dataOutput.writeUTF("Send End");
				dataOutput.flush();

				if (clientMsg.equals("STOP"))
					break;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (s != null)
					s.close();
				if (ss != null)
					ss.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
