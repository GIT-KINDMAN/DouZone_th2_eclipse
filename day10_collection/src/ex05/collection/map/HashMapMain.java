package ex05.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A씨", new Integer(90));
		map.put("B씨", new Integer(55));
		map.put("C씨", new Integer(85));
		map.put("D씨", new Integer(100));
		map.put("E씨", new Integer(75));
		
		System.out.println(map); // 뭐지 거꾸로 출력되는데 이게 맞나 Stack이라 그런거구만??
		
		Set set = map.entrySet(); // Map -> Set.
		Iterator it = set.iterator(); // Set은 Iterator로 출력해야 함
		
		while (it.hasNext()) {
//			Map<K,V>.Entry<K,V> it.next();
			
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름: "+e.getKey()+", 점수: "+e.getValue()); 
		}
		
		set= map.keySet();
		System.out.println("참가자 명단: "+set);
		
		Collection values = map.values();
//		System.out.println(values);
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("총합: "+total);
		System.out.println("평균: "+(double)total/set.size());
		System.out.println("최고 점수: "+Collections.max(values)); // 100점
		System.out.println("최저 점수: "+Collections.min(values)); // 55점
	}

}
