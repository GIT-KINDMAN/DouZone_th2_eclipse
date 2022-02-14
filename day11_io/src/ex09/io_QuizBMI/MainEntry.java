package ex09.io_QuizBMI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainEntry { // View

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean flag = true;

	public static void main(String[] args) throws IOException, Exception {

		BMIManager bmi = new BMIManager();

		while (flag) {
			bw.write(
					"=======================================================================\n[ 1) 접수자 정보 입력, 2) 접수자 정보 삭제, 3) 모든 접수자 검사 결과 출력, 4) 파일 저장, 0) 프로그램 종료 ]\n입력: ");
			bw.flush();
			int T = Integer.parseInt(br.readLine());
			bw.write("=======================================================================\n");
			bw.flush();
			bmi.funcSwitch(T);
		}
	}
}