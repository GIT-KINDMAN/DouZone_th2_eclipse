package ex04.list;

import java.util.*;
class  LinkedListEx1{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>(); // 제네릭 넣어주면 노란 경고도 없어짐
		list.add("c");
		list.add("d");
		list.add("k");
		list.add("o");
		list.add("p");
		list.add("x");
		list.addFirst("a");
		list.addLast("z");
		System.out.println(list);
		list.remove("k");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.set(2,"a");
		System.out.println(list);
		list.set(3,list.get(1)+"change");
		System.out.println(list);
		String str1 = (String)list.peek(); // 큐에서 데이터를 꺼내온다. 만일 큐가 비어있다면 null을 반환 + null을 반환 한다는건 공간까지 지워졌다는거?
		System.out.println("=====================");
		System.out.println(str1);
		System.out.println(list);
		String str2 = (String)list.poll(); // 큐의 맨 아래 있는 객체를 반환한다. 이 때 객체를 큐에서 제거하진 않는다
		System.out.println(str2);
		System.out.println(list);
		list.offer("a");
		System.out.println(list);
		String str3 = (String)list.remove(); //
		System.out.println(str3);
		System.out.println(list);
	}
}
