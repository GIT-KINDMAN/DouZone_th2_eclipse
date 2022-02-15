package ex01.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainEntry {

	public static void main(String[] args) {
		Frame f = new Frame();
		
		f.setTitle("First Frame");
		f.setBackground(Color.YELLOW);
		f.setVisible(true);
		f.setBounds(500,350,500,300);
		
//		f.pack(); 
//		f.setSize(500, 400);
		
//		f.setSize(500,400);
//		f.setLocation(500,350);

		f.addWindowListener(new WindowAdapter()  {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}

}
