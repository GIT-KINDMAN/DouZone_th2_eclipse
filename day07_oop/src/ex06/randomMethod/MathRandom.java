package ex06.randomMethod;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println();
		// random() : 난수 발생 0.0 ~ 1.0
		System.out.println(Math.random()*5); // 0<=x<5
		System.out.println((int)(Math.random()*5)); // 0<=x<5
		System.out.println(Math.random()*5+1); // 1<=x<6
		
		System.out.println();
		
		
		boolean[] visit;
		for(int i=1; i<7; i++) {
			System.out.println((int)(Math.random()*45)+1);
		}
	}

}
