package quiz.ex2;


class SumTest {
	public static void main(String args[]) {
		int i = 10;
		int j = 20;
		
		MySum ms1 = new MySum(i,j);
		MySum ms2 = new MySum(i,j);
		
		System.out.println(ms1);
		
		if(ms1.equals(ms2))
			System.out.println("ms1�� ms2�� �հ�� �����մϴ�.");
	}
}
class MySum /* 1�� */extends Object {
	int first;
	int second;

	MySum(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public String toString() {
		/* 2�� */
		String result = String.valueOf(10 + 20);
		return result;
	}

	public boolean equals(Object obj) {

		if (obj instanceof MySum) {

			/* 3�� */

			return true;
		} else {
			return false;
		}
	}

}