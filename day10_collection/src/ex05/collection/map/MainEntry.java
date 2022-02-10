package ex05.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {

		Map map = new HashMap();

		map.put("kosa", "th");
		map.put("kbs", 128937);
		map.put("it", "th2");
		map.put("kosa", "th2");

		System.out.println("요소 개수: "+map.size()); // 같은 key가 올 경우 value값은 덮어써짐
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id: "); String id = sc.nextLine().trim();
			System.out.print("password: "); String pwd = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!map.get(id).equals(pwd)) {
					System.out.println("비밀번호를 다시 입력해주세요.\n");
				} else {
//					System.out.println(id+"님의 "+pwd+" 입장하셨습니다.");
					System.out.println("id와 pwd가 일치합니다.");
					break;
				}
			}
		} // end while
	}

}
