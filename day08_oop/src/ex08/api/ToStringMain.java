package ex08.api;

class Rectangle {
	int x,y;
	public void disp() {
		System.out.println(x+","+y);
	}
	@Override
	public String toString() {
		return x+","+y;
	}
}

public class ToStringMain {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r); // toString을 재정의하기 전엔, 주소값이 출력된다.
		System.out.println(r.toString()); // toString을 재정의하기 전엔, 주소값이 출력된다.
	}

}
