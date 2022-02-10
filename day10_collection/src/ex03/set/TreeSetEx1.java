package ex03.set;
import java.util.*;
class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet(); // TreeSet: 자동 정렬된다. [우선순위 -- 숫자>영문자:대문자>소문자>한글] 즉, Z가 a보다 먼저 온다. ASCII 생각하면 편할듯
		String from = "a";
		String to	= "b";
		set.add("abc");
		set.add("alien");set.add("bat");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dZZZZ");set.add("dzzzz");
		set.add("elephant");set.add("elevator");
		set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println("range search : from " + from  +" to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}