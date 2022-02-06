package ex02.overload;

public class MainEntry {
    public static void main(String[] args) {
        
        line(3,5);
        line();
        line(5,3);
        line();
        line("*",10);
        line();
        line(3);
    }

    public static void line() {
        System.out.println("--------------------------------");
    }

    public static void line(int n) {
        for (int i=1; i<=n; i++) {
            System.out.println("================================");
        }
    }

    public static void line(String str, int n) {
        for (int i=1; i<=n; i++) {
            System.out.print(str+" ");
        }
        System.out.println();
    }

    public static void line(int x, int n) {
        int tmp;

        // if (x>n) {
        //     int tmp = x;
        //     x=n;
        //     n=tmp;
        // }

        // 삼항 연산자
        tmp = (x<n)? n: x;

        for (int i=x; i<=tmp; i++) {
            System.out.print("+");
        }
        System.out.println();
    }
}
