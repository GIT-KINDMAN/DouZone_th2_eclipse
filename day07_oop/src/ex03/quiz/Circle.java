package ex03.quiz;

import java.util.Scanner;

public class Circle extends Draw {

	public Circle() {
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름= ");
		this.r = sc.nextInt();
	}

	@Override
	public double calc() {
		this.result = (r*r)*Math.PI;
		return result;
	}

	@Override
	public String toString() {
		result = calc();
		return "Circle [r= " + r + ", result= " + result + "]";
	}

	public void show() {
		System.out.println(w+","+h+", result= "+calc());
	}

}
