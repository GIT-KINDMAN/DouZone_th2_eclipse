package ex01.string;

public class StringMethod {

	public static void main(String[] args) {
		
		String s1 = "happyDonghun";
		String s2 = "SEOUL";
		
		System.out.println(s2.hashCode());
		System.out.println(s2.replace("EO","korea")); //
		System.out.println(s2); // SEOUL
		System.out.println(s2.hashCode());
		s2 = s2.replace("EO","korea"); // 문자열 변경
		System.out.println(s2); // SkoreaUL
		System.out.println(s2.hashCode()); // -1910762226
		System.out.println();
		s1 = s1+s2;
		System.out.println(s1);
		
		System.out.println("==================================");
		String s3 = new String("	ab cd		");
		System.out.println(s3);
		System.out.println(s3.length()); // 문자열 길이
		s3 = s3.trim(); // 공백 제거
		System.out.println(s3); // 문자 사이의 공백은 제거 X. 오로지 가외의 공백만 삭제
		System.out.println(s3.length());
		
//		String s4 = new String("ab defgh 23444 keirw 99349");
//		String[] s5 = s4.split(" ");
		
		String s4 = new String("ab/defgh/23444/keirw/99349");
		String[] s5 = s4.split("/");
		
		for (int i=0;i<s5.length;i++) {
			System.out.println(i+"번 문자열: "+s5[i]); // e.g. 주민등록번호
		}
		
		String s6 = "1234567890dlfkgjasdf 354501237 lasdafskdj 20953485532 string";
		int n = s6.indexOf('5');
		System.out.println(n); // "5"를 제일 처음 만나는 인덱스 번호 출력
		System.out.println(s6.indexOf('r'));
		System.out.println(s6.lastIndexOf('5'));
		
		System.out.println("==================================");
		char ch = s6.charAt(24); // + 생각해보니, 이진탐색에서 같은 수 시작, 종료 지점 index 구하는거 lastIndexOf-indexOf 조합으로 안되나?
		System.out.println(ch); // 25번째 char
		System.out.println(s6.charAt(21)); // 21번째 char
		
		s6 = s6.substring(3); // 3번 인덱스부터 끝까지 출력
		System.out.println(s6);
		
		s6 = s6.substring(5, 7); // 시작값 포함, 끝값 미포함
		System.out.println(s6); // ? 90 나오는게 맞나
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("소문자로 출력 toLowerCase(): "+s2.toLowerCase());
		System.out.println("대문자로 출력 toUpperCase(): "+s1.toUpperCase());
		
		System.out.println(s1.length());
		char[] ch2 = s1.toCharArray();
		
		for (int i=0; i<ch2.length; i++) { // ch2.length
			System.out.print(ch2[i]+"\t");
		}
		
//		String str = "abc";
//		
//		System.out.println(str); // abc
//		System.out.println(str.concat("def")); // 출력만 1회성으로 abcdef
//		System.out.println(str); // abc
//		str = str.concat("def");
//		System.out.println(str); // abcdef
//		
//		System.out.println(str + "ijk234032");
//		String msg =" 324234273892";
//		System.out.println(str+msg);

	}

}
