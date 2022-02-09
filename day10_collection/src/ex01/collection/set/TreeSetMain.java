package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int[] score = {85, 95, 50,35, 45, 65,10,100};
		
		for (int i=0;i<score.length;i++) {
			//set.add(score[i]);
			set.add(new Integer(score[i]));
		}
		System.out.println(set); // HaspSet과의 차이 --> 자동 정렬됨. But! 기본 제공은 무조건 오름차순으로만. // 로또 프로그램처럼 중복X 정렬O 쓸때 좋다
		
		// 이렇게 입력하면, 50보다 작은 값이 출력된다. 왜? headSet에 대해 공부하고 적어놓자.
		

//		System.out.println("50보다 작은 값: " + set.headSet(new Integer(50)));
		System.out.println("50보다 작은 값: " + set.headSet(50)); // [10, 35, 45] // headSet(set)이라고 쓰면 숫자를 넣은게 아니라서 터짐 
		System.out.println("50보다 큰 값: " + set.tailSet(50)); // [50, 65, 85, 95, 100]
	}

}
