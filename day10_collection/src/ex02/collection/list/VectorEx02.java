package ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);
		
		System.out.println("-------------- 3개 객체 추가 ---------------");
		v.addElement("자바"); // String
		v.addElement(new Double(10.2)); // Double
		v.addElement(date); // Object
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		
		System.out.println("-------------- 10개 객체 추가 ---------------");
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		for (i=0;i<10;i++) {
			v.addElement(new Integer(i)); // addElement 쓰다가도 add 써도 아무 상관 없음
		}
		System.out.println("size: "+v.size()+",capacity: "+v.capacity());
		
		System.out.println("-------------- Vector 내용 출력  ---------------");
		Enumeration enu = v.elements(); // Enumeration은 또 뭐임???????????????????????
										// 대충 찾아보니 Iterator 와 같은 기능, 그러나 Vector에 맞게 스레드 지원하는 자료형
		
		while(enu.hasMoreElements()) {
			System.out.print(enu.nextElement()+"  ");
		}
		System.out.println("---------------- 객체 내용 포함 확인 ----------------");
		if(v.contains("자바")) System.out.println("자바 문자열 포함됨");
		System.out.println("10.2 객체의 위치는? " + v.indexOf(new Double(10.2))); // 1
		System.out.println(v.get(v.indexOf(date)));
		
		// date 객체 삭제
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		v.removeElementAt(v.indexOf(date));
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		
		System.out.println(v);
		System.out.println();
		
		for(i=0; i<v.size(); i++) {
//			v.removeElementAt(i); // remove 할때마다 인덱스가 땡겨지기때문에, 징검다리로 지워진다.
//			v.remove(0); // 0번 인덱스 계속 삭제. 근데 0 value와는 어떻게 비교?
//			v.removeAllElements(); // 모두 삭제
//			v.remove(10.2); // 10.2 value 삭제
//			v.remove("자바"); // 자바 value 삭제
		}
		
		System.out.println("size: "+v.size()+", capacity: "+v.capacity());
		System.out.println(v);
		
	}

}
