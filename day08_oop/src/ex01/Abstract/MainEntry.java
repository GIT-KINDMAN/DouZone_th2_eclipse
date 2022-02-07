package ex01.Abstract;


abstract class Shape { // 추삭클래스 , Super class
	
	double result = 0;
	public abstract double calc(); // 추상 메소드
	public abstract void draw();
	
	public void show() { // 일반 메소드
		System.out.println("Super class Shape");
	}
}

class Circle extends Shape { // Sub class. 상속 받은 클래스

	double r = 7.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("원의 넓이: "+result+"인 원을 그렸습니다.");
	}
	
	public void disp() { // 일반 메소드
		System.out.println("Super class Shape");
	}
} // Circle end

class Triangle extends Shape {

	double width = 5.0;
	double height = 7.0;
	
	@Override
	public double calc() {
		result = width * height / 2;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("삼각형의 넓이: "+result+"인 삼각형을 그렸습니다.");
	}
	
}

//ex02부터는 클래스 분리

public class MainEntry {

	public static void main(String[] args) {
//		Shape sh = new Shape(); // 자체적으로 객체 생성할 수 없다.
		
		Shape sh = new Circle(); // 상속 받은 자손 클래스로는 객체 생성을 할 수 있다. 다만! 다운그레이드 객체 생성이다. 부모로 만들면 부모 객체에 있는 내용만 생성된다. 
//		sh.disp(); // 다운그레이드 객체 생성이다. 부모로 만들면 부모 객체에 있는 내용만 생성된다. Circle(자식)에 있지만 Shape(부모)에 없는 경우임. => 부모.자식클래스 호출 불가

		Circle c = new Circle();
		c.disp(); // 정상 호출 됨
		
		sh.calc();
		sh.draw();
		
		Shape tr = new Triangle();
		tr.calc();
		tr.draw();
	}
}