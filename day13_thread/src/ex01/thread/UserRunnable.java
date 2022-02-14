package ex01.thread;

public class UserRunnable implements Runnable {

	String name;
	
	
	public UserRunnable(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() { // 스레드 실행부 (구현부)
//		super.run(); // 이것만으로는 아무것도 없음
		System.out.println(name);
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				try {
					Thread.sleep(500); // Runnable에는 sleep 메소드가 없어서 static으로 불러줘야함
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
//		Runnable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);
//		t1.start();
		
		new Thread(new UserRunnable("u1")).start();
		new Thread(new UserRunnable("u2")).start();
		new Thread(new UserRunnable("u3")).start();
	}
}
