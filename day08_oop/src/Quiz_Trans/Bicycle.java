package Quiz_Trans;

public class Bicycle extends Trans {

	@Override
	public void start() {
		System.out.println(name("자전거: ")+ "자전거 출발음♬");

	}

	@Override
	public void stop() {
		System.out.println(name("자전거: ")+ "자전거 정차음♬");

	}

}