package workjunit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class junitQ2Test {

	@Test
	public void testQ1() {
	junitQ2  myjunit = new junitQ2();
	 int result1 = Collections.min(Arrays.asList(2, 5, 1, 8, 34, 20, 4));
	 
	assertEquals(1 , result1);
	}
	@Test
	public void testQ2() {
		junitQ2  myjunit1 = new junitQ2();
		 int result2 = Collections.max(Arrays.asList(2, 5, 1, 8, 34, 20, 4));
		 
		assertEquals(34 , result2);
	 
}
}
