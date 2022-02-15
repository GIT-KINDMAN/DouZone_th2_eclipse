package ex01.lambda;

@FunctionalInterface
interface Plus {
	int sum(int x, int y);
}
//
//class P {
//	public void number(Plus msg) {
//		msg.sum(4, 5);
//	}
//}
public class LambdaAnnotation {

	public static void main(String[] args) {
		
		Plus plus = (x,y) -> x+y; // 교수님 코드
//		Plus plus = ((x,y)->{(x+y)}); // 안됐던 이유: 이렇게 바로 넣을 때는 parameter인 것이 아니므로 전체를 묶을 이유가 없음
	}

}
