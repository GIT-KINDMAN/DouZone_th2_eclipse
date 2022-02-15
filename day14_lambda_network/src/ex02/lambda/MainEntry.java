package ex02.lambda;

import java.util.ArrayList;
import java.util.List;

public class MainEntry {

	public static void main(String[] args) {
		Thread t = new Thread(()->{
			System.out.println("Thread Start");
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Thread End");
		});

//		t.start();
//		System.out.println(t); // 스레드의 정보를 가지고 오는거. 스레드 이름은 Thread-0이고 우선순위는 5이고 객체가 생성된 그룹의 getName은 main이다
		
		System.out.println("=====================================");
		List<String> list = new ArrayList();
		list.add("java");
		list.add("jsp");
		list.add("react");
		
		
//		System.out.println(list);
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		list.forEach(item->System.out.println(item)); // void Iterable 타입 // 한 줄일때는 중괄호도 생략 가능
	}

}