package ex08.io;

import java.io.*;

public class ObjectInputStreamEx {
	public static void main(String[] args) 
			throws FileNotFoundException, 
					IOException, 
					ClassNotFoundException {
		
		InputStream is = new FileInputStream("grade.txt");
		ObjectInputStream oos = new ObjectInputStream(is);
		
		Grade vo = (Grade)oos.readObject(); // 읽은 순서대로 
		System.out.println("result output : " + vo);
		oos.close();
		
	}
}
