package ex01.thread;

public class MainEntry {

	public static void main(String[] args) {

//		Thread t1 = new Thread(); // 이건 아무것도 만들어진거 없음
		Thread t1 = new UserThread("t1"); // t1 = 생성자 이름
		Thread t2 = new UserThread("t2"); // t2 = 생성자 이름
		Thread t3 = new UserThread("t3"); // t3 = 생성자 이름
		
		t2.setPriority(10); // 우선순위 명시적 설정... 하지만 이렇게 해도 안맞을 수 있음
		t1.setPriority(2);
		t3.setPriority(5);
		
//		t1.run(); // 명시적인 호출은 스레드 작업 아님. 꼭!!!!! start()를 통해서 유도해야만 스레드 작업이 된다.
		t1.start();	// Thread 클래스의 start()를 통해 UserThread의 run()을 유도한다.
		t2.start();
		t3.start();	
		// JVM의 메세지 큐에 있는 어쩌고 때문에 출력 순서는 무작위로 나올 수 있음
		
		System.out.println("============================");
		System.out.println(t3.getPriority()); // 니 순서가 몇번째냐 라고 출력 가능
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(t2.getName()); // Thread-1
		System.out.println(t1.getName()); // Thread-0
		System.out.println(t3.getName()); // Thread-2
		
		System.out.println("****************************");
		System.out.println(t2.getId());
		System.out.println(t1.getId());
		System.out.println(t3.getId());
	}

}
