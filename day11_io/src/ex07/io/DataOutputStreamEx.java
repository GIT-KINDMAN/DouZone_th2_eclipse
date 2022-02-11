package ex07.io;
import java.io.*;

public class DataOutputStreamEx implements Serializable { // Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술.
	public static void main(String[] args) throws Exception { //
		
		File file = new File("example.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);  // ASCII code --> 'A'
		dos.writeShort(100);
		dos.writeInt(5000);
		dos.writeLong(888000);
		dos.writeFloat(8.8f);
		dos.writeDouble(12.3456870);
		dos.flush(); // buffer 비우기.  8 KBYTE
		
		System.out.println("example.txt 파일에 " + 
									dos.size() + "byte save");
		dos.close();
		
	}
}










