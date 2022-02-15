/**
 * return type 예제
 */
//package ex01.lambda;
//
//interface Message {
//	public int something();
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Number is "+su);
//	}
//}
//
//public class LambdaMain {
//
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		// 람다를 이용하지 않은 평소의 방법 (파라미터 예제)
//		p.greeting(new Message() { // 익명클래스
//			@Override
//			public int something() {	
//				return 2;
//			}
//		});
//		
//		// 람다 적용 방법 (매개 변수 없어도 상관 없음)
//		System.out.println("=======================");
//		p.greeting(
//					() -> { 		
//						  return 20;
//						  }
//				  );
//
//	}
//
//}
