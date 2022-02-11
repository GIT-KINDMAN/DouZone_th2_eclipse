package ex04.file;

import java.io.*;
import java.util.Scanner;

public class FileInputEx {

	public static void main(String[] args) {//throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		try {
//			OutputStream os = new FileOutputStream("test.txt"); // 상대 경로
			OutputStream os = new FileOutputStream("C:\\Users\\A\\git\\DouZone_th2_eclipse\\day11_io\\test2.txt"); // 절대 경로. 왜 \를 두번씩 써야하지? 그게 싫으면 C:/USER/ 방식으로 쓰면 됨.
			
			while(true) {
				System.out.print("문자열 입력 요망: ");
				String str = sc.nextLine()+"\r\n";
				
				if(str.toUpperCase().equals("EXIT\r\n")) break;
				
				os.write(str.getBytes());
			} // end while
			
			System.out.println("Test.txt save success!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
