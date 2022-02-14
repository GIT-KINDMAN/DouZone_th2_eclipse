package ex01.thread;

public class UserThread extends Thread {

	String name;

	public UserThread(String name) {
		this.name = name;
	}

	@Override
	public void run() { // 스레드 실행부 (구현부)
//		super.run(); // 이것만으로는 아무것도 없음
		System.out.println(name);
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				try {
					sleep(500); // try catch 필수
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}
}
