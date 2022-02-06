package ex07.randomClass;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int r = (rand.nextInt())*100;
		
		Scanner sc = new Scanner(System.in);
	
		
		boolean v = false;
		for (int i=0; i<5; i++) {
			int t = sc.nextInt();
			if(t==r) {
				v = true;
				break;
			}						
		}
		
		sc.close();
		
		if(v) System.out.println("당첨");
		else System.out.println("꽝");
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for()
//		System.out.println(rand.nextInt()); // nextInt() int형 크기 안에 있는 임의적인 숫자 추출됨
//		System.out.println(rand.nextInt(5)); // 0~4
//		System.out.println(rand.nextInt(10)+1); // 1~10
//		
//		System.out.println();
//		for(int i=1; i<7; i++) {
//			System.out.print(rand.nextInt(45)+1+" ");
//		}
	}

	
}
