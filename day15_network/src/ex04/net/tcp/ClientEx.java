package ex04.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {

	public static void main(String[] args) {

		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
							  // ServerSocket은 필요 없음
		Socket client = null; // socket 1
		
		try {
			client = new Socket("localhost",9999);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String outputMessage;
			while(true) {
				System.out.print("message input: ");
				outputMessage = stin.readLine();
				
				if (outputMessage.equalsIgnoreCase("exit")) {
					bw.write(outputMessage);
					bw.flush();
					break;
				} // end if
				
				bw.write("클라이언트> "+outputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			} // end while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				client.close();
			} catch (Exception e) {
				System.out.println("Server와 통신 중 오류 발생!!");
			}
		}

	}

}