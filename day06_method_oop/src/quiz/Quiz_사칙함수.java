package quiz;


/**
 * info() 이름, 연락처, 주소 출력 함수
 * abs(int x) 절대값 출력하는 함수
 * max() 두 개 정수 입력 받아서 큰 수 리턴하는 함수
*/
import java.util.Scanner;

public class Quiz_사칙함수 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        info();
        System.out.print("\n1개의 수 입력(abs) : ");
        int T = sc.nextInt();
        System.out.println("절대값: " + abs(T));

        System.out.print("\n2개의 수 입력(max) : ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println("큰 수: " + max(N, M));

        System.out.print("\n2개의 수 입력(사칙연산) : ");
        N = sc.nextInt();
        M = sc.nextInt();
        System.out.print("\nadd: ");
        add(N, M);
        System.out.print("sub: "+sub(N, M));
        System.out.print("\nmul: "+mul(N, M));
        System.out.printf("\ndiv: %.2f",div(N, M));

        sc.close();
    }

    public static void info() {
        System.out.println("이름: 이동훈");
        System.out.println("연락처: 010-1234-5678");
        System.out.println("주소: 서울특별시 강동구");
    }

    public static int abs(int T) {
        return Math.abs(T);
    }

    public static int max(int N, int M) {
        if (N > M)
            return N;
        else
            return M;
    }

    public static void add(int X, int Y) {
        System.out.println(X + Y);
    }

    public static int sub(int X, int Y) {
        return X - Y;
    }

    public static int mul(int X, int Y) {
        return X * Y;
    }

    public static double div(int X, int Y) {
        try {
            return (double)X / Y;
        } catch (Exception e) {
            System.out.println("불능");
        }
        return Y;
    }
}

// sub, mul: return 타입 적용
// try catch: div
