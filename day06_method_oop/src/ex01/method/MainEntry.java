package ex01.method;

//import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        
        // Scanner sc;
        // sc = new Scanner(System.in);
    
        // int kor = sc.nextInt();
        // System.out.println(kor);

        //1
        System.out.println(plus());

        //2
        int result = plus();
        System.out.println(result); // 책임은 메인 메소드에

        // add(1,2);
        // namePrint();
        // namePrint();
        // namePrint();
        // add(10,30);


    }
    public static void add(int x,int y) {
        int sum = x+y;
        System.out.println(sum);
    }

    public static void namePrint() {
        for(int i=0;i<10;i++) {
            System.out.println("이동훈 ");
        }
    }

    //2
    public static int plus() {
//      int result = 300;
        return 2+3-5*7;
    }

    //3
    public static int plus(String y) {
        int result = 300;
        return result;

    }

    //4
    public static double plus(double x) {
        int sum = (int)x + 100;
        return sum;
    }

    public static double plus(int x) {
        int sum = x + 100;
        return sum;
    }

    // 리턴하는 타입보다 함수의 타입(함수명 앞)이 우선
}
