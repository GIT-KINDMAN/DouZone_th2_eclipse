package ex02.stringBuffer;

public class MainEntry {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("length       /         capacity");
		int len = sb.length();	int size = sb.capacity();
		System.out.println(len+"    /    "+size);
		
		sb.append("happyvirus");
		len = sb.length();	size = sb.capacity();
		System.out.println(len+"    /    "+size);// 10 / 16 --> 6자 낭비
		
		sb.append("12345 67890");
		System.out.println(sb.length()+"    /    "+sb.capacity()); // 21 / 34 --> 13자 낭비
		
		sb.append("skfjsk erwei 67890");
		System.out.println(sb.length()+"    /    "+sb.capacity()); // 39 / 70 --> 31자 낭비 --> trimToSzie()로 용량 크기 축소 가능 
		
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb.length()+"    /    "+sb.capacity()); // 39 / 39
	}

}
