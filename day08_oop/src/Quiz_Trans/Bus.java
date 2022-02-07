package Quiz_Trans;

public class Bus extends Trans {

	@Override
	public void start() {
		System.out.println(name("버스: ")+ "버스 출발음♬");

	}

	@Override
	public void stop() {
		System.out.println(name("버스: ")+ "버스 정차음♬");

	}

}