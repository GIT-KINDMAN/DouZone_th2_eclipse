package quiz;

import java.util.Scanner;
import java.util.Random;

public class Updown {
	
	static int answer, input;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		answer = random.nextInt(100) + 1;

		for (int i = 0; i < 5; i++) {
			System.out.println("input 1~100");
			input = sc.nextInt();
			if (input > answer) {
				System.out.println("down");
			} else if (input < answer) {
				System.out.println("up");
			} else {
				break;
			}
		}

		if (input == answer) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect, answer: " + answer);
		}
		sc.close();
	}

}