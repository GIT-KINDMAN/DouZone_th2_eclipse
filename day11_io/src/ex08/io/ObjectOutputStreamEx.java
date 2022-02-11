package ex08.io;

import java.io.*;

public class ObjectOutputStreamEx {
	public static void main(String[] args) throws IOException {
		Grade vo = new Grade();
//		vo.setSubject("체육");
//		vo.setScore(80);
		vo.setScore(90);
		vo.setSubject("미술");
		
		System.out.println(vo); // 화면에 출력
		OutputStream os = new FileOutputStream("grade.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo); // 파일에 쓰기작업
		oos.close();
	}
}






