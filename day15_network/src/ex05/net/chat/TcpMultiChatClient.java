package ex05.net.chat;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length!=1) {
			System.out.println("USAGE: java TcpMultiChatClient nickName ");
			System.exit(0);
		}
		try {
			String ip = "127.0.0.1";
			Socket s = new Socket(ip, 8000);
			System.out.println("서버에 연결되었습니다.");
			
			Thread send = new Thread(new ClientSender(s,args[0]));
			Thread receiver = new Thread(new ClientReceiver(s)); //
			
			send.start();
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end main
	
	static class ClientSender extends Thread { // inner class
		Socket s;
		DataOutputStream dos;
		String name;
		
		
		public ClientSender(Socket s, String name) { // 매개변수 2개, 생성자 함수
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in); // 키보드로부터 입력 받기

			try {
				if(dos!=null) dos.writeUTF(name);
				while(dos!=null) dos.writeUTF("["+name+"] "+sc.nextLine());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	} // ClientSender end
	
	static class ClientReceiver extends Thread {
		Socket s;
		DataInputStream dis;
		
		public ClientReceiver(Socket s) {
			this.s = s;
			
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while(dis!=null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}