package ex01.generic;

public class GenericEx<T> {
	T[] v; // 멤버 변수. 타입이 결정나지 않았음
	
	public void set(T[] v) {
		this.v = v;
	}
	
	public void print() {
		for (T item : v) {
			System.out.println(item);
		}
	}
}