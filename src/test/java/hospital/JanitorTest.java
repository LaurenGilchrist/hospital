package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JanitorTest {
	
	Janitor underTest = new Janitor("","",true);
	
	@Test
	public void shouldBeSweeping() {
		boolean check = underTest.isSweeping();
		assertTrue(check);
	}
	
	@Test
	public void shouldGetPaid40k() {
		String check = underTest.paySalary();
		assertEquals(check, "40000");
	}

}
