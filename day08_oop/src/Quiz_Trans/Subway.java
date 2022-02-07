package Quiz_Trans;

public class Subway extends Trans {

	@Override
	public void start() {
		System.out.println(name("지하철: ")+ "지하철 출발음♬");

	}

	@Override
	public void stop() {
		System.out.println(name("지하철: ")+ "지하철 정차음♬");

	}

}