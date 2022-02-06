package ex02.inheritance;

public class Point {
    protected int x;
    protected int y;

    public Point() {
//    	x=y=20;
    	this(3,5); // 생성자 함수를 가리키는 함수
    	System.out.println("Point default");
    }
    public Point(int x) {
    	this.x=x;
    	y=9;
    	System.out.println("Point 1");
    }
    public Point(int x,int y) { //2
    	this.x=x;
    	this.y=y;
    	System.out.println("Point 2");
    }
    
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

    
      	
//    public void disp() {
//        System.out.println("x: " + x + "\ty: " + y);
//    }
}
