package quiz;

import java.util.Scanner;

class TV {
	private int channel, volume;
	private String color;
	
	public TV() {
		super();		
	}

	public TV(int channel, int volume, String color) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", color=" + color + "]";
	}
}
	
public class Quiz_1 {
	public static void main (String[] args) {

		TV tv = new TV(6, 10, "white");
		System.out.println(tv);
		
		TV tv2 = new TV();
		tv2.setChannel(7);
		tv2.setVolume(5);
		tv2.setColor("Black");
		tv2.getChannel();
		tv2.getVolume();
		tv2.getColor();
		System.out.println(tv2);
		
		
	}
}
