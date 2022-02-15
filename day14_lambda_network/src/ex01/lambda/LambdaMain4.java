package ex01.lambda;

// type을 명시적으로 기재해 주어야 하는 상황이 있음.
// 그에 대한 예제

interface Message {
	public void something(int x, int y); // functional interface
//	void good(int x); // 지금의 기능을 위해서는 인터페이스에 2개 함수가 들어가면 안됨
}

interface Talk {
	public void something(String x, String y);
}

interface SmallTalk {
	public void something(String x);
}

class Person {
	public void greeting(Message msg) {
		msg.something(1, 2);
	}
		
	public void greeting(Talk msg) {
			msg.something("Hello", "World");
	}
	
	public void greeting(SmallTalk msg) {
		msg.something("Yeah");
	}
}

public class LambdaMain4 {

	public static void main(String[] args) {
		Person p = new Person();
		
		// 람다를 이용하지 않은 평소의 방법 (파라미터 예제)
		p.greeting(new Message() { // 익명클래스
			@Override
			public void something(int x, int y) {
				System.out.println("parameter value: "+x+", "+y);
			}
		});
		
		// 람다 적용 방법
		System.out.println("=======================");
		char ch = 'A';
		p.greeting(			
					(int x,int y) -> { // (x,y) 즉 매개변수를 2개 갖는 함수가 두개 있으므로 오버로딩된 함수의 구분을 위해 명시적으로 Type을 기재해 주어야 하는 경우 
							System.out.println("parameter value: "+x+", "+y);
							System.out.println(ch); // 읽기는 됨
//							ch ='B'; // 쓰기는 불가. FINAL 처리 돼있는듯
							NUM = 111; // static은 또 됨
						  }
				  );
		
		// 개인적으로 추가한 코드
		System.out.println("=======================");
		p.greeting(			
				x -> { // 마찬가지로 오버로딩에서 구분이 되기 때문에 명시적 Type 작성 필요하지 않음 
						System.out.println("parameter value: "+x);
					  }
			  );

	}
	static int NUM = 999;

}
