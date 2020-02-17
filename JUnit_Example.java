/*
 * JUnit classes are specialized for checking the results of a programs methods against 
 * the expected results as predicted by the programmer
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnit_Example {

	// Make sure to define a reference variable for the class that is to be tested here
	JUnit_Driver a;
	
	/*
	 * The annotation here means this method will run before each subsequent test
	 */
	@BeforeEach
	void setUp() throws Exception {
		a = new JUnit_Driver();
	}

	/*
	 * The annotation here means this method will run after each test
	 */
	@AfterEach
	void tearDown() throws Exception {
		a = null;
	}

	/*
	 * These test methods typically employ methods of the assert nature, in order to assert whether 
	 * an actual result is comparable to the expected result
	 */
	@Test
	void testFindQuotient() {
		assertEquals(7.0, a.findQuotient(21.0, 3.0));
	}

	@Test
	void testFindProduct() {
		assertEquals(18.0, a.findProduct(6.0, 3.0));
	}

	@Test
	void testFindPower() {
		assertEquals(125.0, a.findPower(5.0, 3.0));
	}

}
