package quiz2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainEntry {

	public static void main(String[] args) {

		System.out.println("입력: [이름, 직급, 부서, 연락처]");
		
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());

		String name = st.nextToken();
		String rank = st.nextToken();
		String dept = st.nextToken();
		String phone = st.nextToken();

		Employee e;

		if (rank.equals("계약직")) {
			e = new PartTime(name, rank, dept, phone);
		} else if (dept.equals("영업")) {
				e = new Sales(name, rank, dept, phone);
		} else {
			e = new Regular(name, rank, dept, phone);
		}
		
		System.out.println(e);
		
		sc.close();
	}
}