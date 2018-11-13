package ServerSocket;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		Socket socket = null;

		try {
			//http://localhost:9000 입력시 연결
			ss = new ServerSocket(9000);
			System.out.println("Made for Client");

			socket = ss.accept();
			System.out.println("Linked with Client");
			System.out.println(socket);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (ss != null)
					ss.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
