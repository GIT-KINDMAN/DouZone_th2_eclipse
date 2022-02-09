package ex03.utilPackage;

import java.util.Date;
import java.util.Calendar;

public class MainEntry {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print(cal.get(Calendar.MONTH)+1+"월 "); // 월은 0부터 시작함. 왜 이따위냐
		System.out.print(cal.get(Calendar.DATE)+"일");
		
		System.out.println("\n=====================================\n");
		
		Date date = new Date(); 
		int h = date.getHours(); // Deprecated, 일단은 실습
		int m = date.getMinutes(); // Deprecated
		int s = date.getSeconds(); // Deprecated
		
		System.out.println("현재 시간은 "+h+":"+m+":"+s);
		
//		Calendar cal2 = Calendar.getInstance();
//		
//		cal2.set(2022,12,20,0,0);
//		if()
//		
	}

}
