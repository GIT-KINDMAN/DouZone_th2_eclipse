package quiz;

import java.util.Scanner;
import java.util.Random;

public class Lottery {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] lottery = new int[6];

		boolean flag = true;
		int index = 0;
		while (index<6) {
			int num = rand.nextInt(45) + 1;

			for (int i = 0; i < index; i++) {
				if (lottery[i] == num) {
					flag = false;
				}
			}

			if (flag) {
				lottery[index] = num;
				index++;
			}
			flag = true;
		}
		
		System.out.println("당첨 번호");
		for (int i = 0; i < lottery.length; i++) {
			System.out.print(lottery[i] + " ");
		}
	}
}