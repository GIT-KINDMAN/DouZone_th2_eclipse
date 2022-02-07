package ex02.Abstract;

public class MainEntry {

	public static void main(String[] args) {
		
		//3. 이건 좀 이해를 할 필요가 있나
//		Shape ss = new Shape(); // 추상클래스는 자체적으로 객체 생성 불가
		Shape[] ss = new Shape[3]; // 이건 그냥 배열로 샏성한거
		
//		ss[0] = new Circle();
//		ss[1] = new Rect();
//		ss[2] = new Triangle();
		
		Object[] shape = { new Circle(), new Rect(), new Triangle() };
		String[] name = { "Circle", "Rect", "Triangle" };
		
		for (int i=0; i<shape.length;i++) {
			ss[i] = (Shape)shape[i]; 
		}
		
		
//		for (int i=0;i<ss.length;i++) {
//			ss[i].show(name[i]);
//		}
		
		
		System.out.println("=============================");
		
		
		//2.Shape 부모 추상클래스를 이용해서 객체 생성
		Shape sh = new Circle();
		sh.show("Circle Circle");
		
		sh = new Rect();
		sh.show("Rect Rect");
		
		sh = new Triangle();
		sh.show("Triangle Triangle");
		
		
		System.out.println("=============================");
		
		
		//1. 각자의 클래스로 객체 생성 형태
		Circle c = new Circle();
		c.show("원");
		
		Rect r = new Rect();
		r.show("Rectangle");

		Triangle t = new Triangle();
		t.show("삼각형");
		
		Shape s = new Circle(); // 다형성 구현 가능의 증거!
		s.show("Circle");

	}

}
