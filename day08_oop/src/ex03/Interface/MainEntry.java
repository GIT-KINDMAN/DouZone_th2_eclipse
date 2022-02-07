package ex03.Interface;

interface A { // interface - abstract method, final field만 소유
	int x = 9; // 그냥 써도 final이 생략된 것. 이탤릭체가 되어 있음을 유의. 즉, {final static int x = 9;} 와 동일한 의미이다.
	final int y = 7777;
	char ch = 'A';
	
	// 추상 메소드 구현 시에도 abstract 생략 가능. 단, 일반 메소드처럼 body 구현 작성 불가
	public void show();
	public abstract void disp();
} // A end

interface B {
	void bView();
}

interface C {
	String name = "happy";
	public void draw();
}

interface D extends B { // interface 간의 상속에서도 extends 키워드를 사용한다... implements가 아니라?
	void dView();
}

class Rect implements D {

	@Override
	public void bView() { // interface D가 B를 상속받았기에 나타남
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dView() {
		// TODO Auto-generated method stub
		
	}
	
	// 이제는 클래스 단이므로, 일반 클래스 생성 가능
	public int plus(int x, int y) {
		return x+y;
	}
} // Rect end

class Shape {
	
} // Shape end

class Multi extends Shape implements B, C, A { // 컴파일러 구조 상 extend 먼저 오고 implements가 와야 함

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {

	public static void main(String[] args) {

	}

}
