package quiz;

import java.io.*;

public class BMI implements Serializable {
	
	protected int id;
	protected double tall, weight, bmi;
	protected String name, judge;
	
	public BMI(int id, String name, double tall, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.tall = tall;
		this.weight = weight;
		this.bmi = this.setBmi();
		this.judge = this.setJudge(this.bmi);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTall() {
		return tall;
	}
	public void setTall(double tall) {
		this.tall = tall;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public double setBmi() {
		return bmi = this.weight / ((this.tall/100.0)*(this.tall/100.0));
	}
	public String getJudge() {
		return judge;
	}
	public String setJudge(double bmi) {
		if (bmi < 18.5) {
			return "저체중";
		} else if (18.5 <= bmi && bmi < 22.9) {
			return "정상";
		} else if (23.0 <= bmi && bmi < 24.9) {
			return "과체중";
		} else {
			return "비만";
		}
	}
	
	@Override
	public String toString() {
		return "BMI [id=" + id + ", name=" + name + ", tall=" + tall + ", weight=" + weight + ", bmi=" + bmi + ", judge=" + judge + "]";
	}
	
	

	
	
}
