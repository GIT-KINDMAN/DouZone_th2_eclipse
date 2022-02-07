package ex08.api;

import java.util.Scanner;

class Point { }

public class ObjectClass {

	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name: "+ pt.getClass());
//		System.out.println("class name: "+ new Scanner(System.in).getClass());
		System.out.println("hash code: " + pt.hashCode()); // 자리수는 성능에 따라 달라질 수도 있음 // 366712642
		System.out.println("Object String: " + pt.toString()); // Object String: ex08.api.Point@15db9742
		System.out.println("Object String: " + pt);
		System.out.printf("10진수: %d\n", 0x15db9742); // hashCode 366712642 = (클래스명)@ 0x15db9742
		
		System.out.println("==============================================");
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name: "+ pt2.getClass());
		System.out.println("hash code: " + pt2.hashCode()); // 메모리 상의 주소 // 자리수는 성능에 따라 달라질 수도 있음 // 2101973421
		System.out.println("Object String: " + pt2.toString()); // Object String: ex08.api.Point@15db9742
		System.out.println("Object String: " + pt2);
		System.out.printf("10진수: %d\n", 0x7d4991ad); // hashCode 366712642 = Point@ 0x15db9742
		
		System.out.println("##############################################");
		
		System.out.println("pt2.toString(): toString()의 의미");
		//ex08.api.Point@7d4991ad
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode())); // getClass() = 현재 참조하고 있는 클래스를 확인 할 수 있는 메소드 
		
		Point pt3 = new Point();
		
		if(pt.hashCode() == pt3.hashCode()) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Point pt4;
		pt4 = pt; // ????
		
		if(pt.hashCode() == pt4.hashCode()) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}

// 신기하네 왜 강사님 예시랑 똑같지? 패턴이 있나?
