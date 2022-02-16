package ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTime {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		System.out.println("Server Start!!!");
		
		int port = 7000; // 0 ~ 1024 포트는 이미 예약되어있음. well known port

		try {
			ss = new ServerSocket(9000); // socket 1 ?? 서버소켓은 1번 아니었음?
			s = ss.accept(); // socket 2
			
			// I / O
			InputStream is = s.getInputStream(); // read from socket
			OutputStream os = s.getOutputStream(); // write to socket
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			String msg = "Hi Client, I'm Server";
			os.write(msg.getBytes());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
			s.close();
			ss.close();
			} catch (IOException e) {
				e.printStackTrace();}
			}
	}
}

//package ex03.net.tcp;
//
//import java.io.ObjectOutputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.net.SocketException;
//import java.util.Date;
//
//public class ServerTime {
//
//	public static void main(String[] args) {
//		int port = 7000; // 0 ~ 1024 포트는 이미 예약되어있음. well known port
//
//		try {
//			System.out.println("server start!");
//			ServerSocket ss = new ServerSocket(port); // socket 1
//
//			while (true) {
//				Socket s = ss.accept(); // socket 2
//
//				OutputStream os = s.getOutputStream(); // net 통해서 출력함
//				ObjectOutputStream oos = new ObjectOutputStream(os);
//
//				oos.writeObject(new Date()); // 서버측 날짜
//				oos.flush();
//				s.close();
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}
