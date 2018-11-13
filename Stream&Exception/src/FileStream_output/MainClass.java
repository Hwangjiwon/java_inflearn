package FileStream_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream output = null;
		try {
			output = new FileOutputStream("D:\\JAVA_inflearn\\project\\hi.txt");
			String data = "Hi Hello java_inflearn";
			byte[]arr = data.getBytes();
			
			try {
				//output.write(arr);
				output.write(arr, 0, 5);
			} catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(output != null) output.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
