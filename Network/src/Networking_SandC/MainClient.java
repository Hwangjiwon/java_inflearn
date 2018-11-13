package Networking_SandC;

import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket s = null;

		try {
			s = new Socket("localhost", 9000);
			System.out.println("Linked to server");
			System.out.println(s);
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
