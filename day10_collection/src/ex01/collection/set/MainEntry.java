package ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 1) Set : 순서 없음 + 중복 허용하지 않음
public class MainEntry {

	public static void main(String[] args) {
		
		// 제네릭 지정하면 해당 타입 자료만 입력 가능
		// 단! 제네릭은, 무조건  Wrapper 클래스  자료형만 가능하다. primitive 타입은 불가능하다.
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");

		System.out.println("요소 개수: "+hs.size());
		System.out.println(hs);
		
		// 제네릭 지정 안하면 어떤 타입이든 가능
		HashSet hs2 = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
		
		System.out.println("요소 개수: "+hs2.size());
		System.out.println(hs2);
		
		System.out.println("==========================");
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("==========================");
		for(Object item : hs2) {
			System.out.println(item);
		}
		
		System.out.println("==========================");
		System.out.println(hs); // 주소가 아니라 데이터 나옴
		
		it = hs2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
//		Object[] objArr = { "1", new Integer(1), "2", "3", "3", "4", "t", "4", 1, 12.34 }; // 자료형이 다르면 Unbox 값이 같아도 다른거임. 중복 아님
//
//		// 객체가 아니므로 new Set()은 안됨
//		Set set = new HashSet();
//
//		for (int i = 0; i < objArr.length; i++) {
//			set.add(objArr[i]);
//		}

	}

}
