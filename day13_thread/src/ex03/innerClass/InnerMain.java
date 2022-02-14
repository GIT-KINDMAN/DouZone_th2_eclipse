package ex03.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerMain { // outer class

	class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) { // 수행 시 일어날 이벤트 작성
			System.out.println("ActionEvent 발생했습니다."); // 버튼 클릭 시 콘솔에 띄울 메시지

			System.out.println(e.getActionCommand()); // 액션 명령 이름을 호출 -> 버튼 이름: Button-Start
			System.out.println(e.getSource()); // get 소스 -> java.awt.Button[button0,8,31,284x161,label=Button-Start]
		}
	} // inner class end

	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스"); // 프레임
		Button btn = new Button("Button-Start"); // 버튼
		
//		// 1.
//		EventHandler handler = new InnerMain().new EventHandler(); // 핸들러 = 이너클래스
//		btn.addActionListener(handler); // 버튼에 이너클래스의 내용을 액션-리스너로 넣는다
		
		// 2. ActionListener를 handler 대신 그냥 바로 넣는다? --> 이게 바로 익명 클래스
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // 수행 시 일어날 이벤트 작성
				System.out.println("ActionEvent 발생했습니다."); // 버튼 클릭 시 콘솔에 띄울 메시지

				System.out.println(e.getActionCommand()); // 액션 명령 이름을 호출 -> 버튼 이름: Button-Start
				System.out.println(e.getSource()); // get 소스 -> java.awt.Button[button0,8,31,284x161,label=Button-Start]
			}
		});
		
		// 버튼 눌러서 꺼버리는 리스너 (익명 클래스 버전) 
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		// 그래픽
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setLocation(300,150);
	}
}
