package com.ranju.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void testAdd() {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(10, myCalc.addNumbers(5, 5));
	}
	
	@Test
	public void testSubstract () {
		JenkinsCalculator myCalc = new JenkinsCalculator();
		assertEquals(5, myCalc.substractNumbers(10, 5));
	}
}
