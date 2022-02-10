package quiz.Student_LDH;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentManager { // controller

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int index = 1;

	private static ArrayList<Student> std = new ArrayList<Student>();

	public void addStd() throws IOException {

		bw.write("학생 정보 입력: [id, 학생 이름, 국어 점수, 영어 점수, 전산 점수]\n입력: ");
		bw.flush();

		st = new StringTokenizer(br.readLine());

		int id = Integer.parseInt(st.nextToken());

		// id, 이름, kor, eng, com
		Student s = new Student(id, st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()));

		if (id == index) {
			std.add(s);
			index++;
		} else {
			bw.write("순차적으로 id 등록 요망 ("+index+"번 부터)\n");
			bw.flush();
		}
	}

	public void removeStd() throws NumberFormatException, IOException {
		bw.write("삭제할 학생 id 입력: [학생 id]\n입력: ");
		bw.flush();
		int id = Integer.parseInt(br.readLine());
		std.remove(id-1);
		bw.write("삭제 완료\n");
		bw.flush();

	}

	public void updateStd() throws IOException {

		bw.write("점수를 변경할 학생의 id 입력: [학생 id]\n입력: ");
		bw.flush();

		int id = Integer.parseInt(br.readLine());

		bw.write("선택한 학생의 변경할 점수 입력: [국어 점수, 영어 점수, 전산 점수]\n입력: ");
		bw.flush();

		st = new StringTokenizer(br.readLine());

		std.get(id-1).setKor(Integer.parseInt(st.nextToken()));
		std.get(id-1).setEng(Integer.parseInt(st.nextToken()));
		std.get(id-1).setCom(Integer.parseInt(st.nextToken()));
	}

	public void printStd() throws IOException {

		bw.write("모든 학생 정보 출력\n");
		for (int i = 0; i < std.size(); i++) {
			bw.write(std.get(i) + "\n");
			bw.flush();
		}

	}

	public void exit() throws IOException {
		bw.write("프로그램 종료");
		bw.flush();
		System.exit(0);
	}

	public void funcSwitch(int T) throws IOException {
		switch (T) {
		case 1:
			addStd();
			break;
		case 2:
			removeStd();
			break;
		case 3:
			updateStd();
			break;
		case 4:
			printStd();
			break;
		case 0:
			exit();
			break;
		default:
			bw.write("올바른 기능 번호를 입력하시오.\n");
			bw.flush();
		}

	}

}
