package Networking_SandC;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		Socket s = null;
		try {
			ss = new ServerSocket(9000);
			System.out.println("server ready");

			s = ss.accept();
			System.out.println("client linked");
			System.out.println(s);

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
