package ex06.oop;

class Point {
    private int x,y;

    //getter / setter method
    public int getX() { return x; }
    public void setX(int xx) { x = xx; }

    public int getY() { return y; }
    public void setY(int yy) { y= yy; }

    // get set 계속 쓰기 귀찮으니
    // user method 제작

    public void disp() {
        System.out.println(x+","+y);
        System.out.println(getX()+","+getY());
    }
    // @Override
    // public String toString() {
    //     return x+","+y;
    // }
    
}

public class MainEntry {
    public static void main(String[] args) {
        Point pt = new Point();

        pt.setX(90);
        pt.setY(80);
        System.out.println(pt.getX()+", "+pt.getY());
    }
}
