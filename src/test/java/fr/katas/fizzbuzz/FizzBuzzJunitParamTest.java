package fr.katas.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzJunitParamTest {
	
	@Test 
	@Parameters({"3", "6", "9", "33"})
	public void fizz_on(int a_multiple_of_3) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(a_multiple_of_3);
		
		Assert.assertEquals("fizz", result);
	}
	
	@Test 
	@Parameters({"5", "10", "55", "100"})
	public void buzz_on(int i) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(i);
		
		Assert.assertEquals("buzz", result);
	}
	
	@Test 
	@Parameters({"15", "30", "45", "90"})
	public void fizzbuzz_on(int i) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(i);
		
		Assert.assertEquals("fizzbuzz", result);
	}

	@Test 
	@Parameters({"0", "1", "2", "4"})
	public void otherwise_echo_its(int input) {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(input);
		
		Assert.assertEquals(String.valueOf(input), result);
	}
}
