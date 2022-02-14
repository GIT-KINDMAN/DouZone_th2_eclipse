package ex09.io_QuizBMI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BMIManager { // Controller

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int index = 1;

	private static ArrayList<BMI> bmi = new ArrayList<BMI>();

	public void addBMI() throws IOException {

		bw.write("정보 입력: [이름, 키, 몸무게]\n입력: ");
		bw.flush();

		st = new StringTokenizer(br.readLine());

		int id = index;

		BMI s = new BMI(id, st.nextToken(), Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));

		bmi.add(s);
		index++;

	}

	public void removeBMI() throws NumberFormatException, IOException {
		bw.write("삭제할 접수자 번호 입력: [접수 번호]\n입력: ");
		bw.flush();
		int id = Integer.parseInt(br.readLine());
		bmi.remove(id - 1);
		bw.write("삭제 완료\n");
		bw.flush();

	}

	public void printBMI() throws IOException {

		bw.write("모든 접수자 정보 출력\n");
		for (int i = 0; i < bmi.size(); i++) {
			bw.write(bmi.get(i) + "\n");
			bw.flush();
		}

	}
	
	public void saveBMI() throws IOException {

		OutputStream os = new FileOutputStream("BMI.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(bmi.toString()); // 파일에 쓰기작업
		oos.close();
		System.out.println("저장 완료");
	
	}
	
	public void exitBMI() throws IOException {

		bw.write("프로그램 종료");
		bw.flush();
		System.exit(0);
	}

	public void funcSwitch(int T) throws IOException {
		switch (T) {
		case 1:
			addBMI();
			break;
		case 2:
			removeBMI();
			break;
		case 3:
			printBMI();
			break;
		case 4:
			saveBMI();
			break;
		case 0:
			exitBMI();
			break;
		default:
			bw.write("올바른 기능 번호를 입력하시오.\n");
			bw.flush();
		}

	}

}
