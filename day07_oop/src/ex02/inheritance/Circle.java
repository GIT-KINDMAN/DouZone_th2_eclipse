package ex02.inheritance;

public class Circle extends Point{
    private int x;
    private int y;
    private int r;

    public Circle() {
    	x=y=10;
    }
    public Circle(int x) {
    	super(x);
    }
    public Circle(int x, int y) {
    	super(x,y);
    }
    
    public Circle(int x, int y, int r) {
    	super(x,y);
    	System.out.println("Circle 3");
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

    public int getR() {
//    	super.disp();
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}
//    public void disp() {
//        System.out.println("x: " + x + "\ty: " + y);
//    }
}
