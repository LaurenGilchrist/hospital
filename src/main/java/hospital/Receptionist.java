package hospital;

public class Receptionist extends Employee {

	private boolean isAnswering;

	public Receptionist(String empNumber, String empName, boolean isAnswering) {
		this.empNumber =empNumber;
		this.empName = empName;
		this.isAnswering = isAnswering;
		
	}

	@Override
	public String paySalary() {
		return "45000";
	}

	public boolean isOnPhone() {
		return isAnswering;
	}

}
