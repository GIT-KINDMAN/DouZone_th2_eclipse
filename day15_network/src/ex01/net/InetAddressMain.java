package ex01.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strUrl = null;
		InetAddress[] address;
		
//		System.out.println("site address = ");
		
		try {
//			strUrl = br.readLine();
//			address = InetAddress.getAllByName(strUrl);
			address = InetAddress.getAllByName("www.sw.or.kr"); // 도메인이름/IP주소
//			address = InetAddress.getAllByName("223.130.195.200"); // 리터럴로 넣으면 IP주소 유효성 체크만
			
			for(InetAddress item : address) {
				System.out.println(item);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
