package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest {
	
	Surgeon underTest = new Surgeon("","","",true);
	Patient patient = new Patient();
	
	
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
	public void shouldGetPaid120k() {
		String check = underTest.paySalary();
		assertEquals(check, "120000");
	}
	
	@Test
	public void shouldBeOperating() {
		boolean check = underTest.isOperating();
		assertTrue(check);
	}
	
}
