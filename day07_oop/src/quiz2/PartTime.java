package quiz2;

public class PartTime extends Employee {
	
	int workDays = 20;
	int hourlyWage = 9150;
	
	int salary=workDays*hourlyWage;
	
	public PartTime(String name, String rank, String dept, String phone) {
		super(name, rank, dept, phone);	
	}
	
	public void setSalary(int salary) {
		this.salary = this.workDays*this.hourlyWage;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}

	public void setWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	@Override
	public String toString() {
		return "PartTime [이름: "+this.name+" 직급: "+this.rank+" 부서: "+dept+" 연락처: "+this.phone+" 월급: "+this.salary+"원]";
	}
}