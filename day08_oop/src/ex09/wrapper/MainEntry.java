package ex09.wrapper;

class Point { }

public class MainEntry {

	public static void main(String[] args) {

		Integer Ia = new Integer(9);
		Integer Ib = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(pt.getClass().getName()+'@'+Integer.toHexString(pt.hashCode())); 
		
		System.out.println(Ia);
		System.out.println(Ia.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode())); // Wrapper 클래스는!!! 포인터 주소값이 아니라!!! 실제 값이 나온다!!!!!!! a = 16진수로 10
		
		int x = 77;
		double y = 5.5;
		System.out.println(x+","+y);
		
		x=(int)y; // 저 위의 x와 이 x는 스택 영역에 있는 같은 x
		System.out.println(x+","+y);
		
		// Boxing vs UnBoxing (스택에서 힙으로, 힙에서 스택으로)
		int c = Ia.intValue(); // 밑과 메모리 주소 자체가 다르다 // jdk 4.x 이전에 사용하던 메소드였음
		int d = Ib; // 위와 메모리 주소 자체가 다르다 // 자동형변환 된 상태
		
		System.out.println("-----------------------------");
		System.out.println(c+","+d); // Boxing
		int num = Integer.parseInt(su);
		
		System.out.println(c+num);
		System.out.println(c+d);
		System.out.println(Ia.MAX_VALUE); // 21억
		System.out.println(Ia.MIN_VALUE); // -21억
		
		Double dd = new Double(12.34);
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println("=============================");
		
		//c = (int)dd;
		c = (int)dd.doubleValue();
		System.out.println("=============================");
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("1111111",2); // make 1111111(2) --> 적은 수를 2진법으로 바꿔달라
		System.out.println(e+20);
		System.out.println(f);
		
		int xx = 3; // stack memory!!
		int xxx = Integer.parseInt("5"); // heap memory!!
		
		System.out.println(xx);
		System.out.println(xxx);
	}

}
