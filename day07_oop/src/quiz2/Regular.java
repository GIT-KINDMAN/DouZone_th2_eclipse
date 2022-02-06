package quiz2;

public class Regular extends Employee {

	protected double salary = 500;
	
	public Regular(String name, String rank, String dept, String phone) {
		super(name, rank, dept, phone);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Regular [이름: "+this.name+" 직급: "+this.rank+" 부서: "+dept+" 연락처: "+this.phone+" 월급: "+this.salary+"만원]";
	}
	
}