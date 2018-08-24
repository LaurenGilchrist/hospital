package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		Doctor phil = new Doctor("1", "Phil", "Brain");
		Surgeon harry = new Surgeon("2", "Harry", "Brain", true);
		Nurse jackie = new Nurse("3", "Jackie", 5);
		Receptionist janine = new Receptionist("4", "Janine", true);
		Janitor rosie = new Janitor("5", "Rosie", true);
		
		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);
		
//		System.out.println("Here are the salary rates at the hospital: ");
//		hospital.showPayRates();
//		
//		System.out.println("Here are the employees who can give medical care:");
//		hospital.showAllMedicalPersonnel();
		
		hospital.showAllEmployees();
	}

}
