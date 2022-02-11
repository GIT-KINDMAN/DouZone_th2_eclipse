package quiz;

import java.io.*;

public class ObjectInputStreamEx {
	public static void main(String[] args) 
			throws FileNotFoundException, 
					IOException, 
					ClassNotFoundException {
		
		InputStream is = new FileInputStream("BMI.txt");
		ObjectInputStream oos = new ObjectInputStream(is);
		
		BMI vo = (BMI)oos.readObject(); // 읽은 순서대로 
		System.out.println("result output : " + vo);
		oos.close();
		
	}
}
