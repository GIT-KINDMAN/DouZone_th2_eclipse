package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BMIManager implements Serializable { // controller

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
		default:
			bw.write("올바른 기능 번호를 입력하시오.\n");
			bw.flush();
		}

	}

}
