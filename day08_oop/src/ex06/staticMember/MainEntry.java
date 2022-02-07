package ex06.staticMember;

class Atm {
	int count; // instance member, 즉 객체 생성해야만 쓸 수 있는 변수
	static int total; // static member
	
	public Atm(int amount) {
		count += amount; // count = count + amount;
		total += amount; //
	}
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
	
	public static void view() { // 스태틱 메소드에서 일반 멤버는 사용할 수 없다. 이유? 목적이 달라서인가 싶기도 하고... non-static은 계속 증발하니까
		total += 100;
		//count += 100; // 불가능
	}
	
	public static void show(int count, int total) {
//		this.count = count; // static method 내에서는 this.변수 사용 불가
//		this.total = total; // 얘도 안됨. static method 내에서 static member를 표현하더라도 this를 쓰면 표현이 불가능
	}
} // Atm end

public class MainEntry {

	public static void main(String[] args) {
		System.out.println(Atm.total);

		Atm at = new Atm(1000);
		at.display();
		System.out.println("-----------------------------");
		
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("-----------------------------");

		Atm at3 = new Atm(1000);
		at3.display();
		System.out.println("-----------------------------");
		
	
		
		
//		클래스
		
//		자바 진영은 4byte


	}

}
