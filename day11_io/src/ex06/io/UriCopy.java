package ex06.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {

	public static void main(String[] args) throws IOException, MalformedURLException {
		URL url = new URL(
				"https://www.google.com/logos/doodles/2021/national-liberation-day-of-korea-2021-6753651837109035-2xa.gif"); // 예외
																																// 발생

		// 읽기객체 - FileInputStream
		InputStream is = url.openStream();

		// 쓰기객체 - FileOutputStream
		OutputStream os = new FileOutputStream("google.gif");
		
		byte[] buffer = new byte[1024 * 8]; // Stream만으로는 더디기 때문에 buffer로 한번에 읽고 써서 보내기
		
		long start = System.currentTimeMillis(); // 시작 시간 저장
		while (true) {
			int inputData = is.read(buffer); // buffer 크기 만큼 데이터를 읽으면 되잖아?
			if(inputData == -1) break;
			os.write(buffer,0,inputData); // 오버로딩 이용. 수정 이후 1024*8개씩 읽어오게 되었으므로 시간이 획기적으로 짧아짐. 700대 -> 8
		}
		long end = System.currentTimeMillis(); // 끝난 시간 저장
		
		System.out.println(end-start); // 작업 소요 시간
		
		is.close(); os.close();
		System.out.println("copy from WEB success!");
	}

}
