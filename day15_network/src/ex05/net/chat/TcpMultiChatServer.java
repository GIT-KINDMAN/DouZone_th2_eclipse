/**
 * 다중 접속 채팅 프로그램 (CLI)
 * 이번에 여태까지 배운 것 거의 다 들어갈 것임
 */
package ex05.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer { // outer class

	HashMap clients; // key, value. 맵 쓸거임
	ServerSocket ss = null; // socket 1
	Socket s = null; // socket 2

	public TcpMultiChatServer() { // 생성자 함수
		clients = new HashMap(); // 객체 생성
		Collections.synchronizedMap(clients); // 점유를 통한 동기화
	}

	public void start() {
		try {
			ss = new ServerSocket(8000);
			System.out.println("[서버 시작됨, 채팅 프로그램 준비 완료]");

			while (true) {
				s = ss.accept(); // 응답대기, 클라이언트 소켓
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s); // User class
				thread.start(); // run() method 유도
			}

		} catch (Exception e) {
			System.out.println("##서버 접속 실패!##");
		}
	} // start() end

	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator(); // key 값 출력

		while (it.hasNext()) {
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(it.next());
				dos.writeUTF(msg); // 한글 깨지지 말라고 인코딩한 것
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	} // sendToAll() end

	class ServerReceiver extends Thread { // // inner class
		Socket s; // 클라이언트 소켓
		DataInputStream dis;
		DataOutputStream dos; // 블럭이 다르니 다시 선언해야 되는게 맞음
		String name = "";

		public ServerReceiver(Socket s) { // 생성자 함수
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크를 통해 읽기
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크를 통해 쓰기
			} catch (IOException e) {
				System.out.println("[서버 리시브 실패!]");
			}
		} // 생성자 end

		@Override
		public void run() { // 스레드 실행부(구현부). 대화 주거니 받거니 하는거 여기다 넣을거임
			try {
				name = dis.readUTF(); // 한글 name 사용 시 깨짐 방지
				sendToAll("#"+name+" 님이 입장하셨습니다."); // user method
				clients.put(name,dos); // HashMap에 넣기
				System.out.println("현재 서버 접속자 수는: "+clients.size()+" 입니다."); // 접속자 수 확인
				
				while(dis!=null) {
					sendToAll(dis.readUTF());
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sendToAll("#"+name+" 님이 나가셨습니다.");
				clients.remove(name); // 접속자 수 제거
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속 종료하셨습니다.");
			}
		} // run() end

	} // end ServerReceiver class

	public static void main(String[] args) {
		new TcpMultiChatServer().start(); // 직접 생성한 start() 함수임

	}

}
