package Quiz_Trans;

public class MainEntry {

	public static void main(String[] args) throws Exception {
		
//		Trans tr;
//		
//		tr = new Subway();
//		tr.start();
//		tr.stop();
//		
//		tr = new Bus();
//		tr.start();
//		tr.stop();
//		
//		tr = new Plane();
//		tr.start();
//		tr.stop();
//		
//		tr = new Bicycle();
//		tr.start();
//		tr.stop();

		
				// 각 운송수단 입력
				String[] name =  {"Subway", "Bus", "Plain", "Bicycle"};
				
				// 입력한 운송수단 만큼의 길이 배열 생성
				Trans[] trans = new Trans[name.length];
				
				// 각 운송수단마다 new (이쯤부터 뭔가 이상한데)
				Object[] trans_obj = {new Subway(), new Bus(), new Plane(), new Bicycle()};
				
				// new 생성한 메모리를 각 trans 원소에 주소값 저장
				for (int i = 0; i < trans.length; i++) {
					trans[i] = (Trans)trans_obj[i];
				}
				
				// 실행
				for (int i = 0; i < trans.length; i++) {
					System.out.println("\n"+trans[i].name(name[i]));
					trans[i].start();
					trans[i].stop();
				
		
//			        String[] name = { "subway", "bus", "Bicycle", "Plane" };
//			        Trans[] ts = { new Subway(), new Bus(), new Bicycle(), new Plane() };
//
//			        for(int i = 0; i < ts.length; i++) {
//			            System.out.println("trans: " + name[i]);
//			            System.out.println(ts[i].start());
//			            System.out.println(ts[i].stop());
//			        }
//			        
//			    }
//			}

		}
	}
}