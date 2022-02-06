package ex01.oop;

public class Circle {
    private int x;
    private int y;
    private int r;

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
        return this.r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void disp() {
        System.out.println("x: " + x + "\ty: " + y);
    }
}
