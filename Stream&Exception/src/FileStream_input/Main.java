package FileStream_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.stream.FileImageInputStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = null;
		try {
			input = new FileInputStream("D:\\JAVA_inflearn\\project\\hello.txt");
			int data = 0;
			byte[]bs = new byte[3];
			
			while (true) {

				try {
					//data = input.read();
					data = input.read(bs);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (data == -1)
					break;
				System.out.println("data: " + data);
				for(int i=0; i<bs.length; i++)System.out.println(bs[i]); //마지막에 나머지는 쓰레기값
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (input != null)
					input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}