package ex02.Synchronized; // DB의 Lock이랑 비슷한 느낌인가봄. 코드가 아무리 엉망이더라도 Synchronized를 걸면 내 프로그램이 자원을 점유한 후 종료되어 메모리 해제되기 전까지 다른 작업은 모두 멈춘다  

class Atm {
	private int money;

	public Atm(int money) {
		this.money = money;
	}

	// 입금 함수
	public synchronized void deposit(int amount, String name) { // synchronized 방식1 (lock)
		money += amount;
		System.out.println(name + "- 입금금액: " + amount);
	}

	// 출금 함수
	public void withdraw(int amount, String name) {
		// synchronized 방식2 (lock)
		synchronized (this) {
			if (money - amount > 0) {

				Thread.yield(); // 양보..?

				money -= amount;
				System.out.println(name + "- 출금금액: " + amount);
			} else {
				System.out.println(name + ": 인출실패(잔액부족)");
			}
		}
	}

	public void getMoney() {
		System.out.println("\t잔액은: " + money);
	}

} // Atm class end

class UserAtm extends Thread {
	Atm obj;
	boolean flag = false;

	public UserAtm(Atm obj, String name) {
		super(name);
		this.obj = obj;
	}

	@Override
	public void run() { // 데이터 오염 등 싱크로 걸어야 할 상황이 생겨서 살펴볼 땐, 항상 run부터 찾아봐라!!
		for (int i = 0; i < 2; i++) {
			try {
				sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (flag) {
				obj.deposit((int) (Math.random() * 10 + 2) * 100, getName());
				obj.getMoney();
			} else {
				obj.withdraw((int) ((Math.random()) * 10 + 2) * 100, getName());
				obj.getMoney();
			}
			flag = true;
		}
	}

}

public class MainEntry {

	public static void main(String[] args) {
		Atm at = new Atm(1000);
		UserAtm user1 = new UserAtm(at, "김");
		UserAtm user2 = new UserAtm(at, "나");
		UserAtm user3 = new UserAtm(at, "박");

		user1.start();
		user2.start();
		user3.start();

	}

}
