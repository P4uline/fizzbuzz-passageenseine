package fr.katas.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest {
	
	@Test
	public void should_return_1_when_input_is_1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(1);
		
		Assert.assertEquals("1", result);
	}
	
	@Test
	public void should_return_2_when_input_is_2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(2);
		
		Assert.assertEquals("2", result);
	}
	
	@Test
	public void should_return_fizz_when_input_is_3() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(3);
		
		Assert.assertEquals("fizz", result);
	}
	
	@Test
	public void should_return_4_when_input_is_4() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(4);
		
		Assert.assertEquals("4", result);
	}
	
	@Test
	public void should_return_buzz_when_input_is_5() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(5);
		
		Assert.assertEquals("buzz", result);
	}
	
	@Test
	public void should_return_fizz_when_input_is_6() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(6);
		
		Assert.assertEquals("fizz", result);
	}
	
	@Test
	public void should_return_fizzbuzz_when_input_is_15() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		
		String result = fizzbuzz.execute(15);
		
		Assert.assertEquals("fizzbuzz", result);
	}

}
