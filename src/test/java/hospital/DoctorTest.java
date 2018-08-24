package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
	
	Doctor underTest = new Doctor("1","name","area");
	Patient patient = new Patient();
	
	
	//test on state verification (variable)
	@Test
	public void shouldBeAbleToDrawBlood() {
		
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore-bloodLevelAfter, is(5));
		
		
	}
	@Test
	public void shouldBeAbleToIncreasePatientHealth() {
		
		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter-healthLevelBefore, is(5));
	}
	
	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "1");
	}
	
	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
	}
	
	@Test
	public void shouldReturnSpecialty() {
		String check = underTest.getSpecialty();
		assertEquals(check, "area");
		
	}
	@Test
	public void shouldGetPaid90k() {
		String check = underTest.paySalary();
		assertEquals(check, "90000");
	}
}
