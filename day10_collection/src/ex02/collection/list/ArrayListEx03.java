package ex02.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx03 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(0));
		list.add(new Integer(2));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list.subList(1,4)); // list2 = { list[1], list[2], list[3] };
		print(list,list2);

		Collections.sort(list);
		Collections.sort(list2);
		print(list,list2);
		
		System.out.println("list.containsAll(list2): "+list.containsAll(list2)); // true
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list, list2);
		
		System.out.println("list.retainAll(list2): "+list.retainAll(list2)); // 데이터가 있는지를 찾는것? 교집합이 있는지 묻는거인듯
		
		// 차집합 만들기. 뒤에서부터 빼면 재정렬에 의한 remove(0)따위의 오류가 일어나지 않음
		for(int i= list2.size()-1;i>=0;i--) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list,list2);
	}

	public static void print(ArrayList list, ArrayList list2) {
		System.out.println("list: "+list);
		System.out.println("list2: "+list2);
		System.out.println();
	}
}
