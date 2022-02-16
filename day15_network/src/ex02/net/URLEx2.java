package ex02.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx2 {

	public static void main(String[] args) throws IOException { // 예외 throws

		URL google = new URL("http://www.google.com"); // 예외 발생

		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream())); // 예외 발생

		String inputLine;

		while ((inputLine = br.readLine()) != null) { // 예외 발생
			System.out.println(inputLine);
		}
		br.close();
	}

}
