package ex02.inheritance;

public class MainEntry {
	public static void main(String[] args) {

		
		Circle c = new Circle();
		System.out.println(c);
		
		Circle c2 = new Circle(1,2,3);
		System.out.println(c2);
		
		
		Rect r = new Rect();
		System.out.println(r);
		
		Point pt = new Point();
		System.out.println(pt);

//        Circle c = new Circle();
//        c.disp();
//        
//        Rect r = new Rect();
//        r.disp();
//        
//    	Point pt = new Point();
//        pt.disp();
	}
}


// this: 자기자신, 객체가 생성될 때 그 객체의 시작 주소를 가지고 있다.
// this(): 생성자 함수의 다른 이름

// 중요한거? super, this, super(), this() 및 다형성(오버로딩,오버라이딩)  

// 생성자 내에서 this()나 super()는 첫줄에 들어가야함. 그리고 두개 동시에 못씀. 무조건 첫번째 줄에 와야하기 때문

// > inheritance 
// - extends
// - 단일 상속만 지원
// - super > 부모 클래스의 멤버에 접근 할 수 있는 인스턴스
//			 super(): 부모클래스의 생성자함수
// - 재사용
// - 확장
 
// 공통적인게 많으면 상속으로 쓰는게 낫다.
// Super는 최소한?? 뭔말이지


// getter/setter VS 생성자
// > 생성자 함수는 객체 생성 시 자동 호출됨 (1회성)
// 처음부터 값을 들고 들어와야 한다(은행, 통장 개설 시 100원 있어야하는 예시 등). 어떠한 값을 꼭 넣고 들어와야하는 상황이라면 생성자 함수 중에서 멤버 필드를 갖는 원소를 만들겠다 한다면 
// (정리:생성자 함수)값이 변경될 일이 없고 + 처음부터 값을 가지고 들어온다 = 생성자 함수
// (정리:getter/setter)아무튼 계속 값을 지속적으로 수정해야하는 경우엔 get/set 메소드를 만들어서 사용해라.

// override(재정의) <--- 상속
// 함수명, 리턴타입, 매개변수 개수가 같은 함수

// cf) overload

// - 추상클래스
// - 인터페이스