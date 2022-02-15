//package ex01.lambda;
//
//interface Message {
//	public int something(int x, int y); // parameter 보유
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(88, 99);
//		System.out.println("Number is "+su);
//	}
//}
//
//public class LambdaMain3 {
//
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		// 람다를 이용하지 않은 평소의 방법 (파라미터 예제)
//		p.greeting(new Message() { // 익명클래스
//			@Override
//			public int something(int x, int y) {
//				System.out.println("parameter 예제");
//				System.out.println("parameter value: "+x+", "+y);
//				return 30;
//			}
//		});
//		
//		// 람다 적용 방법 (매개 변수 없어도 상관 없음)
//		System.out.println("=======================");
//		p.greeting(			// 매개변수가 한개뿐이면! (x) 를 x라고 적어도 된다. 괄호 빼도 됨. 다만 매개변수가 없거나 두 개 이상이면 반드시 괄호를 써야한다
//					(x,y) -> { // (int x) 라고 해도 되고, (x)라고 해도 됨. 단! 이 경우는 매개변수가 1개일 때만 가능 
//						  System.out.println("예아");
//						  System.out.println("parameter value: "+x+", "+y);
//						  return 20;
//						  }
//				  );
//
//	}
//
//}
