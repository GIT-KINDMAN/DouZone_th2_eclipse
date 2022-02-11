package ex03.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su1, su2;
		su1 = Integer.parseInt(br.readLine());
		su2 = Integer.parseInt(br.readLine());
		
		System.out.println(su1+su2);
		
		String str = br.readLine(); // 예외 발생
		System.out.println(str);
	}

}
