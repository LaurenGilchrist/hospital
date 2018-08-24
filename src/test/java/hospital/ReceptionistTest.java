package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReceptionistTest {
	
	Receptionist underTest = new Receptionist("","",true);
	
	@Test
	public void shouldBeOnThePhone() {
		boolean check = underTest.isOnPhone();
		assertTrue(check);
		
	}
	@Test
	public void shouldGetPaid() {
		String check = underTest.paySalary();
		assertEquals(check, "45000");
	}
}
