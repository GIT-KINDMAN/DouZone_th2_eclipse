package ex01.thread;

public class MainEntry {

	public static void main(String[] args) {

//		Thread t1 = new Thread(); // 이건 아무것도 만들어진거 없음
		Thread t1 = new UserThread("t1"); // t1 = 생성자 이름
		Thread t2 = new UserThread("t2"); // t2 = 생성자 이름
		Thread t3 = new UserThread("t3"); // t3 = 생성자 이름


//		t1.run(); // 명시적인 호출은 스레드 작업 아님. 꼭!!!!! start()를 통해서 유도해야만 스레드 작업이 된다.
		t1.start();	// Thread 클래스의 start()를 통해 UserThread의 run()을 유도한다.
		t2.start();
		t3.start();	
		// JVM의 메세지 큐에 있는 어쩌고 때문에 출력 순서는 무작위로 나올 수 있음
		
	}

}
