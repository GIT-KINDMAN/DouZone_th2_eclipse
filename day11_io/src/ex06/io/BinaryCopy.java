package ex06.io;

import java.io.*;

public class BinaryCopy {

	public static void main(String[] args) {
		File src = new File("C:\\Users\\A\\git\\DouZone_th2_eclipse\\th2_java 일자별 정리.txt");
		File dist = new File("C:\\Users\\A\\Download\\info.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int c;
		
		try {
			fis = new FileInputStream(src); // 파일 입력 바이트 스트림 연결
			fos = new FileOutputStream(dist); // 파일 출력 바이트 스트림 연결
			
			bis = new BufferedInputStream(fis); // 버퍼 입력 스트림 연결
			bos = new BufferedOutputStream(fos); // 버퍼 출력 스트림 연결
			
			while((c=bis.read()) != 1) {
				bos.write((char)c);
			}
			System.out.println("파일 복사 성공!");
			
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류 발생!");
//		} finally {
//			try {
//			bis.close();
//			bos.close();
//			fis.close();
//			fos.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			
		}
	}

}
