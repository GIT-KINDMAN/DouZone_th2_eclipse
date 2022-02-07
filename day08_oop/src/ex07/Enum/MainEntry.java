/**
 * enum 열거형) 새로운 자료형이라 보면 편하다. - 새로운 클래스 타입을 정의하는 것 --> 특정한 값만을 가질 수 있는 데이터 타입을
 * 정의할 때 필요하다.
 */

// switch 등에서 0123 불러 썼듯 불러서 찍어쓰면 된다.

package ex07.Enum;

enum UserStatus {
	PENDING, ACTIVE, INACTIVE, DELETE;
}

enum Day {
	SUNDAY, MONDAY, TUESDAY;
}

public class MainEntry {
	// 3
	Day day; // Day 타입으로 선언된 애들은 해당 enum 내에 있는 값만 할당받을 수 있음. 이런 경우가  WEB이나 THREAD에서 가아아아아아끔 쓰일 수 있다.

	public MainEntry(Day day) {
		this.day = day;
	}

	public void tells() {
		switch (day) {
		case SUNDAY:
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.
		System.out.println(UserStatus.ACTIVE);
		System.out.println("----------------------");

		// 2.
		for (UserStatus status : UserStatus.values()) {
			System.out.println(status);
			// System.out.println(Integer.parseInt(status)); // parseInt도 String일 때나 가능한 것
		}

	}

}