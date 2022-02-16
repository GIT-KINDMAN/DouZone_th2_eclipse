package ex02.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) throws IOException { // 예외 throws

		URL url = new URL("https://www.google.com/search?q=yuna"); // 예외 발생
		
		System.out.println("프로토콜: "+url.getProtocol());
		System.out.println("호스트와 포트: "+url.getAuthority());
		System.out.println("호스트: "+url.getHost());
		System.out.println("포트: "+url.getPort()); // -1: 모른다는 뜻
		System.out.println("경로: "+url.getPath());
		System.out.println("질의: "+url.getQuery());
		System.out.println("파일명: "+url.getFile());
		System.out.println("참조: "+url.getRef());	

	}

}