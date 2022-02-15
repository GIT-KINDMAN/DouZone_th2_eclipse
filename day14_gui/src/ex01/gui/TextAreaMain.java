package ex01.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class TextAreaMain extends JFrame implements ActionListener {
	
	TextArea ta; // 선언
	Button btn;

	public TextAreaMain(String str) {
//		setTitle("First Frame");
		setBackground(Color.pink);
		setVisible(true);
		setBounds(500,350,500,300);
		
		btn = new Button("Button1");
		ta = new TextArea("문장을 넣으세요", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);

		
		addWindowListener(new WindowAdapter()  {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}
	
	public static void main(String[] args) {
		new TextAreaMain("새 창 띄우기");
	}


		public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource());
		
	};

}