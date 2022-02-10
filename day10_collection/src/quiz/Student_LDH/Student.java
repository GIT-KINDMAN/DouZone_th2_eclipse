package quiz.Student_LDH;

public class Student { // model
	
	protected String name;
	protected int id, kor, eng, com, total;
	protected double avg;
	protected char grade;

	public Student(int id, String name, int kor, int eng, int com) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
		this.total = this.total();
		this.avg = this.avg(this.total());
		this.grade = this.grade(this.avg);
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	
	public int total(){
		return kor + eng + com;
	}
	
	public double avg(int total) {
		return total/3.0;
	}
	
	public char grade(double avg) {
		int n = (int)avg/10;
		switch(n) {
			case 10:
			case 9 : return 'A';
			case 8 : return 'B';
			case 7 : return 'C';
			case 6 : return 'D';
			default : return 'F';
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", 이름=" + name + ", 국어 점수=" + kor + ", 영어 점수=" + eng + ", 전산 점수=" + com + ", 평균 점수="
				+ avg + ", 학점=" + grade + "]";
	}
}