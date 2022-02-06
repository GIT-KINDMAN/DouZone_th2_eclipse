package ex03.quiz;

import java.util.Scanner;

public class Triangle extends Draw { // Sub class

	public Triangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넓이= ");
		this.w = sc.nextInt();
		
		System.out.print("높이= ");
		this.h = sc.nextInt();
		
	}

	@Override
	public double calc() {
		this.result = (w*h) / 2.0;
		return result;
	}

	@Override
	public String toString() {
//		System.out.println("Triangle toString()");
		result = calc();
		return "Triangle [w=" + w + ", h=" + h + ", result=" + result + "]";
	}

	public void show() {
		System.out.println(w+","+h+", result= "+calc());
	}

}
