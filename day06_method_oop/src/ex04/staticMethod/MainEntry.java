package ex04.staticMethod;
/**
 * static method: 객체 생성 없이 바로 사용 가능함
 * object.methodName();
 * ClassName.methodName();
*/

class A {
    int x,y;
    //static method
    public static void setData(int xx, int yy) {
        System.out.println(xx+", "+yy);
    }
} // A class end

public class MainEntry {
    public static void main(String[] args) {
        A obj = new A(); // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출. 매우 큰 의미
        
        //int x = a.x;

        obj.x = 9; // 직접 값 건드리는건 좋지 않다. 그러나 당장은 static 메소드에 집중해서 공부할거라 패스
        System.out.println(obj.x);
        //obj.setData(3, 5); // 되긴 됨. // object.methodName(); 의 예시
        A.setData(10, 20); // 되긴 됨. // ClassName.methodName(); 의 예시. static에 저장이 된다. 위꺼는? 몰?루

    }
    
}
