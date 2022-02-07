// 다중 interface 실습 패키지

package ex04.Interface;

import ex02.Abstract.Shape;

public class MainEntry {

	public static void main(String[] args) {
		
		// 2. super
		Shape s = new MultiClass();
		s.calc(555); // shape class
		s.show("도형이야");
		s.view(); // Super class Shape
		
		Test t = new MultiClass();
		t.tView(); // test interface
		System.out.println(t.str); // 이건 ~
		
		
		// 1.
		MultiClass mc = new MultiClass();
		mc.draw(); // idraw interface
		System.out.println(mc.su); // 1000
		System.out.println(mc.num); // 0
	}

}

// 오후에 static member, enum 열거형, API