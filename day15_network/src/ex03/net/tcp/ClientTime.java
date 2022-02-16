//package ex03.net.tcp;
//
//import java.io.InputStream;
//import java.io.ObjectInputStream;
//import java.io.OutputStream;
//import java.net.Socket;
//import java.util.Date;
//
//public class ClientTime {
//	public static void main(String[] args) {
//		String serverIP = "127.0.0.1";
//		int port = 7000;
//		Date date = null;
//		
//		try {
//			Socket client = new Socket(serverIP, port);
//			InputStream is = client.getInputStream(); // read
//			ObjectInputStream ois = new ObjectInputStream(is);
//			System.out.println("222Server측 날짜/시간확인. 여긴 클라이언트부");
//					
//					
//			date = (Date)ois.readObject();
//			System.out.println("현재 시간: "+date);
//			String str = "Hi Server";
//			ois.write(str.getBytes("utf-8"));
//			
//			byte[] buffer = new byte[100];
//			is.read(buffer);
//			System.out.println(new String(buffer));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try { s.close(); } catch(Exception e) { e.printStackTrace(); }
//		}
//	}
//}

package ex03.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTime {
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("127.0.0.1", 9000);
			// I / O
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			
			String str = "Hi Server";
			os.write(str.getBytes("utf-8"));
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { s.close(); } catch(Exception e) { e.printStackTrace(); }
		}
	}
}