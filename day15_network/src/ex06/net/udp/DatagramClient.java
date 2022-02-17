package ex06.net.udp;

import java.net.*;
import java.io.*;

public class DatagramClient {

	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;

		int port = 5000;
		String str;
		byte[] b;
		
		try {
			System.out.println("@@@ File UDP Client @@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("전송 대상(server ip) = ");
			String ipAddress = br.readLine();
			System.out.print("전송 파일(파일명.확장자) = ");
			String fileName = br.readLine(); // C:\\Users\\A\\git\\DouZone_th2_eclipse\\th2_java 일자별 정리.txt
			
			File file = new File(fileName);
			
			if(!file.exists()) { // 파일이 존재하지 않으면
				System.out.println("파일이 존재하지 않습니다");
				System.exit(0);
			}
			
			ds = new DatagramSocket();
			InetAddress ip = InetAddress.getByName(ipAddress);
			str = "start";
			b = str.getBytes();
			
			dp = new DatagramPacket(b, b.length, ip, port);
			ds.send(dp); // 송신
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			b = new byte[65536];
			
			while(true) {
				int count = dis.read(b, 0, b.length);
				if(count==-1) break;
				dp = new DatagramPacket(b, count, ip, port);
				ds.send(dp);
			}
			

			str = "end";
			b = str.getBytes("utf-8");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
