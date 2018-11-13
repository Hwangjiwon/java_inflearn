package FileStream_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = null;
		OutputStream output = null;
		
		try {
			input = new FileInputStream("D:\\JAVA_inflearn\\project\\hello.txt");
			output = new FileOutputStream("D:\\JAVA_inflearn\\project\\helloCopy.txt");
			
			byte[] arr = new byte[3];
			while(true) {
				int len = input.read(arr);
				if(len == -1) break;
				output.write(arr,0,len);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(input != null) {
				try {
					input.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(output != null) {
				try {
					output.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
