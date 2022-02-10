package quiz.Student_LDH;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainEntry { // View

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		StudentManager sm = new StudentManager();
		while (true) {
			bw.write("=======================================================================\n[ 1) 학생 정보 입력, 2) 학생 정보 삭제, 3) 학생 정보 수정, 4) 모든 학생 정보 출력, 0) 프로그램 종료 ]\n입력: ");
			bw.flush();
			int T = Integer.parseInt(br.readLine());
			bw.write("=======================================================================\n");
			bw.flush();
			sm.funcSwitch(T);
		}

	}

}
