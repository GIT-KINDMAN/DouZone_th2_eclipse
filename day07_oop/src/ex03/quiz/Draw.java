package ex03.quiz;

public class Draw { // Super class
	
	protected int w, h, r;
	protected double result;
	
	public Draw() { w=h=0; result=0; } // = Object Class
	

	public Draw(int w, int h) {
		super(); // 없어도 됨
		this.w = w;
		this.h = h;
		// this.result = result; // 결과 저장할거라 없어도 됨
	}
	
	public Draw(int w) {
		super();
		this.w = w;
	}


	public int getW() {
		return w;
	}


	public void setW(int w) {
		this.w = w;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getResult() {
		return result;
	}
	
	public double calc() {
		return result;
	}
	
	@Override
	public String toString() {
		return "Draw [w=" + w + ", h=" + h + ", result=" + result + "]";
	}


	public void show() {
		System.out.println();
	}
}