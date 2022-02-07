package ex02.Abstract;

public abstract class Shape {

	double result = 0;
	public abstract double calc(double x); // abstract method for
	public abstract void show(String name);
	public void view() {
		System.out.println("Super class Shape");
	}
}

// 나를 받아서 니가 쓰고 싶을대로 개발해! -->
//일반적인 상속은, 부모가 만들어놨는데 안쓰는게 짱나는거임.
// 수퍼클래스에서 만들어놨는데 자식클래스가 갖다쓰질 않아! 필요없잖아! 니가 만들어! --> 추상클래스+자식클래스 구현

// 마지막 정리: 강제로!! 쓰도록!! 만든거!! (미구현 시 에러) 추상메소드는 자식 클래스에서 상속 후 구현해서 써야한다.