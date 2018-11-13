package DataStream_copy;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = null;
		DataInputStream dataInput = null;
		OutputStream output = null;
		DataOutputStream dataOutput = null;

		try {
			input = new FileInputStream("D:\\JAVA_inflearn\\project\\hi_DataStream.txt");
			dataInput = new DataInputStream(input);
			
			String str = null;
			str = dataInput.readUTF();
			
			output = new FileOutputStream("D:\\JAVA_inflearn\\project\\hi_DataStream_copy.txt");
			dataOutput = new DataOutputStream(output);

			dataOutput.writeUTF(str);

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
				if (output != null)
					output.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}
