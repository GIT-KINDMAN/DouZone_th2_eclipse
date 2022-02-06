package ex04.constructor;

public class MainEntry {
/**
  * @param args 메인은 아무 값도 넘겨 받지 않습니다.
  * @param x 곱을 구하는 것에 첫번째 정수형 변수
  * @param x 곱을 구하는 것에 첫번째 정수형 변수
  * @param mul 변수는 x와 y의 두 정수의 곱을 저장하는 변수
 */
	public static void main(String[] args) {
		int x,y,mul=1;
		String msg;
		char ch = 'A';
		
		x= 5; y= 10;
		msg= "DouZone Th2";
		
		mul =mul(x,y);
		
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x+" * "+y+" = "+mul);
	}

	public static int mul(int x,int y) {
		return x*y;
	}
}


// 여태까지는 java.exe, javac.exe였다면 이제는 javadoc.exe - API