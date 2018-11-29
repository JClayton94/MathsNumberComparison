package mathsThingTest;

import static org.junit.Assert.*;

import java.util.List;

import mathsThing.*;

import org.junit.Test;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class MathsTest {

	@Test
	public void addTest() {

		MathsThing test = new MathsThing();

		//assertEquals("Didn't add correctly", 0, test.addition(4, 2, 8).size());
		assertEquals("Didnt add correctly", 6, test.addition(4, 2, 6));
		
		assertEquals("Didnt add correctly", 1, test.mainResults.size()); 
		
		assertThat(test.mainResults, hasItems("4 + 2 = 6")); 

	}

	@Test
	public void subtractTest() {

		MathsThing test = new MathsThing();

		//assertEquals("Didn't subtract correctly", 0, test.subtraction(4, 2, 8));
		
		List<Integer> testing = test.subtraction(2,4,6); 
		
		assertThat(testing, hasItems(2));

	}

	@Test
	public void divideArrayTest() {

		MathsThing test = new MathsThing();

		assertEquals("Didn't divide correctly", 2, test.division(4, 2, 8).size()); 

	}
	
	@Test
	public void multiplyTest() {

		MathsThing test = new MathsThing();
		
		assertEquals("Didn't multiply correctly", 1, test.multiply(4, 2, 8).size()); 

	}
}
