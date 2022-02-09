package ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

// 2) List: 순서 있고, 중복 허용함
public class VectorEx01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.size()+"\t/\t"+v.capacity()); // 0 / 10
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4); // 초기용량,증가용량
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(20);
		v2.add(23);
		v2.add(55);
		v2.add(12);
		v2.add(88);
		v2.add(333);
		v2.add(88);
		
		System.out.println(v2.size()+"\t/\t"+v2.capacity()); // 6 / 7
		System.out.println(v2.capacity()); // 7 --> 초기 용량 3이었다가, bound 넘는 순간 +4 돼서 용량 7이 됨
										   // 11 --> 333, 88을 add 한 이후 11이 됨
		
		
		// 원소 출력
		System.out.println("------------- Iterator() method ------------------");
		Iterator it = v2.iterator();
		while(it.hasNext()) { 
			System.out.println(it.next());
		}
		
		
		// 원소 출력
		System.out.println("------------- get() method ------------------");
		for (int i=0; i<v2.size(); i++) {
			System.out.println(v2.get(i));			
		}
		
		
		// 정렬 후 원소 출력
		System.out.println("------------- sort result ------------------");
		Collections.sort(v2);
		for (int i=0; i<v2.size();i++) {
			System.out.println(v2.get(i));
		}
//		System.out.println("*********************");
//		for (int i=v2.size(); i<0;i--) {
//			System.out.println(v2.get(i));
//		}
		
		// 원소 출력
		System.out.println("-------------- elementsAt() method ----------------");
		for (int i=0; i<v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.println(num.toString());
		}
		
// 		9/11이면 괜찮지만, 그래도 9/9로 만들어보자!
		System.out.println("-------------- trimToSzie() method ----------------");
		System.out.println(v2.size()+"\t/\t"+v2.capacity());
		v2.trimToSize(); // capacity 조정
		System.out.println(v2.size()+"\t/\t"+v2.capacity());
	}
}
