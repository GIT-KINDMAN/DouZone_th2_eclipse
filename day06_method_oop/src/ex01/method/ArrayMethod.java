package ex01.method;

public class ArrayMethod {
    public static void main(String[] args) {
        int x=3, y=5;

        int result = methodEx(x,y);
        System.out.println(result);

        int[] arrResult = methodEx2();

        // for(int i=0; arrResult.length; i++) {
        //     System.out.print(arrResult[i]+" ");
        // }

        for (int item : arrResult) {
            System.out.println(item);
        }
    }

    // Heap -> Stack 입장
    public static int[] methodEx2() {
        int[] arr = {1,2,3,4,5,6,7,8};
        return arr; // Heap에 올려진 arr의 주소값을 return 한다는 의미
    }

    public static int methodEx(int x, int y) {
        return x+y;
    }
}
