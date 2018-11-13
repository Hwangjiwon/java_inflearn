package Buffered_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "D:\\JAVA_inflearn\\project\\buffer_writer.txt";

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {
			String str = "hello bufferedWrite Is it working?\n";
			str += "Yeeees";

			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);

			System.out.println("end");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
