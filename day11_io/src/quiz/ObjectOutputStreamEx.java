package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ObjectOutputStreamEx {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean flag = true;

	public static void main(String[] args) throws IOException, Exception {

		BMIManager bmi = new BMIManager();

		while (flag) {
			bw.write(
					"=======================================================================\n[ 1) 접수자 정보 입력, 2) 접수자 정보 삭제, 3) 모든 접수자 검사 결과 출력, 0) 파일 저장 및 프로그램 종료 ]\n입력: ");
			bw.flush();
			int T = Integer.parseInt(br.readLine());
			if (T != 0) {
				bw.write("=======================================================================\n");
				bw.flush();
				bmi.funcSwitch(T);
			} else {
				break;
			}

		}

		OutputStream os = new FileOutputStream("BMI.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(bmi); // 파일에 쓰기작업
		oos.close();
		System.out.println("저장 완료");
	}
}
