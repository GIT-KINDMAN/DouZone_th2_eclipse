package quiz2;

public class Sales extends Regular {
	
	protected double incentive = 0.05;
	
	public Sales(String name, String rank, String dept, String phone) {
		super(name, rank, dept,phone);
		super.salary *= (1+incentive); 
	}

	@Override
	public String toString() {
		return "Sales [이름: "+this.name+" 직급: "+this.rank+" 부서: "+this.dept+" 연락처: "+this.phone+" 임금: "+this.salary+"]";
	}
	
}
