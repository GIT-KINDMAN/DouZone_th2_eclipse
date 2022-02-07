package ex04.Interface;

import ex02.Abstract.Shape;
import ex05.Interface.IDraw;

public class MultiClass extends Shape implements IDraw, Test {

	@Override
	public void draw() {
		System.out.println("idraw interface");

	}

	@Override
	public void tView() {
		System.out.println("test interface");

	}

	@Override
	public double calc(double x) {
		System.out.println("shpae class");
		return 1000;
	}

	@Override
	public void show(String name) {
		System.out.println(name);

	}

}
