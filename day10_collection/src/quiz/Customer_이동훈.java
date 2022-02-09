package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Customer_이동훈 {

	String name;
	String addr;
	String phone;

	public Customer_이동훈(String name, String home, String phone) {
		super();
		this.name = name;
		this.addr = home;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", home=" + addr + ", phone=" + phone + "]";

	}

	static ArrayList<Customer_이동훈> list = new ArrayList<Customer_이동훈>();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int index = 0;

	public static void main(String[] args) throws IOException {

		while (true) {
			bw.write(
					"=======================================================================\n[ 1) 고객 가입, 2) 고객 탈퇴, 3) 고객 정보 수정, 4) 모든 고객 정보 출력, 0) 프로그램 종료 ]\n입력: ");
			bw.flush();
			int T = Integer.parseInt(br.readLine());
			bw.write("=======================================================================\n");
			bw.flush();
			execute(T);
		}

	}

	public static void execute(int task) throws IOException {

		switch (task) {
		case 1:
			add();
			break;
		case 2:
			remove();
			break;
		case 3:
			set();
			break;
		case 4:
			print();
			break;
		case 0:
			exit();
			break;
		default:
			bw.write("올바른 기능 번호를 입력하시오.\n");
			bw.flush();
		}
	}

	public static void add() throws IOException {
		bw.write("가입 정보 입력: [고객 이름, 고객 주소, 고객 연락처]\n입력: ");
		bw.flush();
		st = new StringTokenizer(br.readLine());
		list.add(index, new Customer_이동훈(st.nextToken(), st.nextToken(), st.nextToken()));
		index++;
	}

	public static void remove() throws IOException {
		bw.write("삭제할 고객 전화번호 입력: [고객 연락처]\n입력: ");
		bw.flush();
		String p = br.readLine();

		for (int i = list.size() - 1; i >= 0.; i--) {
			if (p.equals(list.get(i).getPhone())) {
				list.remove(i);
				index--;
			}
		}
		list.trimToSize();
	}

	public static void set() throws IOException {
		bw.write("고객의 기존 전화번호 입력: [고객 연락처]\n입력: ");
		bw.flush();
	
		int idx=0;
		
		for(int i=0;i<list.size();i++) {
			if(br.readLine().equals(list.get(i).getPhone())) {
				idx = i;
			}
		
		}
		
		bw.write("고객의 변경할 개인 정보 입력: [고객 이름, 고객 주소, 고객 연락처]\n입력: ");
		bw.flush();
		st = new StringTokenizer(br.readLine());
		
		list.get(idx).setName(st.nextToken());
		list.get(idx).setAddr(st.nextToken());
		list.get(idx).setPhone(st.nextToken());
	}

	public static void print() throws IOException {
		bw.write("모든 고객 정보 출력\n");
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i) + "\n");
			bw.flush();
		}
	}

	public static void exit() throws IOException {
		bw.write("프로그램 종료");
		bw.flush();
		System.exit(0);
	}
}
