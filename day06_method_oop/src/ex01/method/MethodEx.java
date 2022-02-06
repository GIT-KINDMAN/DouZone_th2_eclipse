package ex01.method;

public class MethodEx {
    public static void main(String[] args) {

        System.out.println(name("kbs",5));

        String name = name("동훈");
        System.out.println(name);

        System.out.println(name("동훈"));
    }

    //1
    public static String name(String n) {
        return n;
    }

    //2
    public static String name(String n, int x) {
        String str = null;
        for(int i=0;i<x;i++) {
            str += n+"\n";
        }
        return str;
    }
}
