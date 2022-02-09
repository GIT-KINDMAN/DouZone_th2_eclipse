package ex01.string;

public class MainEntry {

	public static void main(String[] args) {
		String str = new String("korea");
		int x = 99;
		double y = 12.34;
		
		String str2 = "korea"; // 이것도 primitive 아닌가? 이유: API의 java.lang -> Class String에서 이유 조회 가능
		//더 자세히
		
		char data[] = {'a','b','c'};
		String str3 = new String(data); // 애초에, String은 char의 배열과도 상통하기 때문.
		
		//API에서, Deprecated 된건 굳이 쓰지 마라...
		
		System.out.println(str2);
		System.out.println(data[1]);
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" "); // a b c	
		}
//		for(int i : data)
//		System.out.print(i+" "); // 96 97 98

	}

}
