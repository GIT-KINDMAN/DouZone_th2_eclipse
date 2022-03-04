package quiz.prob5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob5 {
	public static void main(String[] args) throws Exception {
		String fileName = "D:\\DouZone_th2\\DouZone_th2\\1_Java\\workspace\\day26_jdbc_gui\\src\\quiz\\prob5\\data.txt";
		makeVariable(fileName);
	}

	private static void makeVariable(String fileName) throws Exception {
		// 구현하세요.

		File file = new File(fileName);

		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = null;
		while ((line = br.readLine()) != null) {

			StringBuilder sb = new StringBuilder();
			
			line = line.toLowerCase();
			char[] temp = line.toCharArray();
			
			for (int i=0; i<temp.length; i++) {
				if (temp[i] != '_') {
					sb.append(temp[i]);
				} else {
					temp[i+1] += ('A'-'a');
				}
			}
			System.out.print(sb+"\n");
		}

		br.close();

	}
}