package ex03.innerClass;

class OuterClass { // 외부클래스
	static int no;
	String memssage = "hi~";

	public void outerMethod() {
		System.out.println("outer method call~");
	}
	
	class InnerClass { // 내부클래스
		int su = 99;
		public void show() {
			System.out.println(su); // 내부(자신의것) 사용가능
			System.out.println(memssage); // 외부클래스 멤버 사용 가능
		}
		
		public void disp() {
			outerMethod(); // 외부클래스 메소드 호출. --> 총정리: 내부클래스는 외부클래스의 모든 것에 접근 가능
		}
	} // InnerClass end
} // OuterClass end

public class MainEntry {

	public static void main(String[] args) {
		//1.
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass inner = oc.new InnerClass();
		
		inner.disp();
		inner.show();
		
		System.out.println("===============================");
		
		//2. 1번의 축약형
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.show();
		
	}

}
