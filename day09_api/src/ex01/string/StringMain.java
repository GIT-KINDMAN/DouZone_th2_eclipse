package ex01.string;

public class StringMain {

	public static void main(String[] args) {

		int x = 3, y = 5;
		System.out.println("x= " + x + "\ty= " + y);
		x = y;
		System.out.println("x= " + x + "\ty= " + y);

		String s1 = "korea";
		String s2 = "happy";
		System.out.println("s1= " + s1 + "\ts2= " + s2);
		System.out.println("hashcode: " + s1.hashCode() + " / " + s2.hashCode()); // 주소값 다름
		s1 = s2; // s2의 내용(주소값)이 s1 내용에 들어감
		System.out.println("s1= " + s1 + "\ts2= " + s2);
		System.out.println("hashcode: " + s1.hashCode() + " / " + s2.hashCode()); // 주소값 같은 것 확인

		s1 = "donghun";
		System.out.println("s1= " + s1 + "\ts2= " + s2);
		System.out.println("s1= " + s1.hashCode() + " / " + s2.hashCode());
		s2 = "kosa";
		System.out.println("s1= " + s1 + "\ts2= " + s2);
		System.out.println("hashcode: " + s1.hashCode() + " / " + s2.hashCode());

		System.out.println("==============================================");

		System.out.println("s1= " + s1 + "\ts2= " + s2);
		System.out.println("hashcode: " + s1.hashCode() + " / " + s2.hashCode()); // 주소값 같은 것 확인
		s2 = "대한민국";

		String s3 = "happy";
		System.out.println("s3.hashcode: " + s3.hashCode());
		System.out.println(s3);

	}

}

// String이 자주 쓰는 메소드, 메모리 낭비는 buffer(jdk1.0부터 있었음), builder(jdk1.5쓰레드지원-동기화지원하냐안하냐) 처리. 이거 얘기 푼다고함