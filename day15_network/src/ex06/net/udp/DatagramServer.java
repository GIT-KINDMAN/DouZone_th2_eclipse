package ex06.net.udp;

import java.net.*;
import java.io.*;

public class DatagramServer {

	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataOutputStream dos = null;
		
		int port = 5000;
		String str;
		File file = null;
		
		try {
			System.out.println("@@@ UDP File Server @@@");
			ds = new DatagramSocket(port); // port = 5000;
			
			while(true) {
				dp = new DatagramPacket(new byte[65536], 65536); // 버퍼 그릇의 크기 지정, 받는 패킷의 길이 지정
				ds.receive(dp); // 수신
				
				str = new String(dp.getData(),0,dp.getLength()).trim();
				
				if(str.equalsIgnoreCase("start")) {
					System.out.println("전송 중...");
					file = new File("C:\\Users\\A\\git\\DouZone_th2_eclipse\\th2_java 일자별 정리.txt");
					
					dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				} else if (str.equalsIgnoreCase("end"))  {
					System.out.println("end");
					break;
				} else if (file!=null) {
					System.out.println(str);
					dos.write(dp.getData(),0,dp.getLength());
				} // end if
			} // end while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
