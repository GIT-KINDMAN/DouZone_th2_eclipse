package ex08.api;

class Circle {
	int x,y;
}

public class EqaulsMain {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("c1: "+c1.hashCode());
		System.out.println("c2: "+c2.hashCode());
		
		
		// primitive 타입은 값 비교니까 당연히 같다고 나온다
		int x=3, y=3;
		System.out.println("기본 자료형 비교");
		if(x==y) System.out.println("같다");
		else System.out.println("다르다");
		
		System.out.println("참조 자료형 비교");
		String str1 = new String("kosa");
		String str2 = new String("Kosa");
		
		if(str1==str2) System.out.println("같다");
		else System.out.println("다르다");
		
		System.out.println("***** equals() method 비교 *****");
		
		System.out.println("대소문자 구분: equals()");
		if(str1.equals(str2)) System.out.println("같다"); // 대소문자 구분함
		else System.out.println("다르다");
		
		System.out.println("대소문자 무시: equalsIgnoreCase()");
		if(str1.equalsIgnoreCase(str2)) System.out.println("같다"); // 대소문자 구분 무시
		else System.out.println("다르다");
	}

}
