package ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain2 {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("로컬 호스트 이름: "+address.getHostName());
		System.out.println("로컬 호스트 IP: "+address.getHostAddress());
		
		address = InetAddress.getByName("www.naver.com"); // 예외 뜬다고 하는데 내 IP 뜨는게 예외처리 된건가
		
		byte[] addr = new byte[4]; // 
		addr[0] = (byte)211;
		addr[1] = (byte)249;
		addr[2] = (byte)220;
		addr[3] = (byte)24;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("daum 호스트 이름: "+address.getCanonicalHostName());
		System.out.println("daum 호스트 이름: "+address.getHostName());
		System.out.println("daum 호스트 이름: "+address.getHostAddress());
		
		System.out.println("===========================================================");
		
		InetAddress[] arr;
		arr = InetAddress.getAllByName("www.google.com");
		for ( InetAddress item : arr ) {
			System.out.println("구글 호스트 이름: "+address.getHostName());
			System.out.println("구글 호스트 이름: "+address.getHostAddress());
		}
	}
}
