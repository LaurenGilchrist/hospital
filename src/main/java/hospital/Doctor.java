package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;
	
	public String getSpecialty() {
		return specialty;
	}
	
	public Doctor(String empNumber, String empName, String specialty) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty = specialty;
	}

	
	@Override
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);
		
	}

	
	@Override
	public void administerCare(Patient patient) {
		patient.receiveHealth(5);
		
	}

	@Override
	public String paySalary() {		
		return "90000";
	}
	}


