package DataStream_output;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "Hi Hello java_inflearn";
		
		OutputStream output = null;
		DataOutputStream dataOutput = null;
		
		try {
			output = new FileOutputStream("D:\\JAVA_inflearn\\project\\hi_DataStream.txt");
			dataOutput = new DataOutputStream(output);
			
			dataOutput.writeUTF(data);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dataOutput != null)
					dataOutput.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(output != null)
					output.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
