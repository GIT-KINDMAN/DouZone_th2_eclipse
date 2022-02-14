package ex01.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread extends JFrame implements Runnable { // Frame : window를 만들어냄

	int num, x, y;
	Color color;
	Random random;
	

	public GraphicThread(int num) { // 생성자 함수
		super();
		this.num = num;
		color = Color.red;
		random = new Random();
		
		setSize(500, 400); // 프레임(화면) 크기 - 너비, 높이
		setVisible(true); // 화면 보여주기
		setLocation(300, 150); // 위치 지정
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기
	}


	@Override
	public void run() {
		Rectangle rect = getBounds(); // 모서리가 둥근 사각형
		
		for (int i=0; i<num; i++) {
			x= random.nextInt(rect.width);
			y= random.nextInt(rect.height);
			
			repaint();
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // end for
	} // end run
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillOval(x, y, 3, 3); // 
	}


	public static void main(String[] args) {
		
		//2.
		new Thread(new GraphicThread(2000)).start(); // 2000번 동안 Thread 형식의 GraphicThread를 start를 통해 run해라
		
		//1.
//		GraphicThread gframe = new GraphicThread(2000);
//		Thread t = new Thread(gframe);
//		t.start();
	} 

}
