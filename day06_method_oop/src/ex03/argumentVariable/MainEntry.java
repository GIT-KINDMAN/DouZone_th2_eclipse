package ex03.argumentVariable;

public class MainEntry {
    public static void main(String[] args) {
        plus("A","B");
        plus("kbs","mbc","KOSA");
        plus(3);
        plus(1,2,3,4,5,5,6,8);
        plus(100,20);
    }    

    // 가변 길이 배열
    private static void plus(int... x) {
        int sum = 0;
        for (int item : x) {
            sum += item;
        }
        System.out.println("sum= "+sum);
        //System.out.println(x+"["+i+"]= "+sum);
    }

    private static void plus(String... x) {
        String str = "";
        for(int i=0; i<x.length; i++)  {
            str += x[i];
        }
        System.out.println(str);
    }
}
    // private static void plus(int i, int j) {
    // }
    // private static void plus(int i, int j, int k, int l, int m, int n, int o, int p) {
    // }
    // private static void plus(int i) {
    // }
