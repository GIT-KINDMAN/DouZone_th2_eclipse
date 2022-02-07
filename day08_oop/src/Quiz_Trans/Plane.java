package Quiz_Trans;

public class Plane extends Trans {
	
	@Override
	public void start() {
		System.out.println(name("비행기: ")+ "비행기 이륙음♬");

	}

	@Override
	public void stop() {
		System.out.println(name("비행기: ")+ "비행기 착륙음♬");

	}

}