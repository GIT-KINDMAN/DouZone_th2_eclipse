package quiz.prob123;
 
public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " �� ��ȯ �ð� >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " �� ��ȯ �ð� >>");
		System.out.println(printTime(seconds));
	}

	private static String printTime(int seconds) {
		int hour = seconds/3600;
		int minute = (seconds%3600)/60;
		int second = seconds%3600%60;
		return hour+"�� "+minute+"�� "+second+"��";
	}
}