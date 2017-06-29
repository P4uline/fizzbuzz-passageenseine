package fr.katas.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzz2Test {
	
	@Test
	public void should_return_fizz_if_param_is_multiple_3() {
		FizzBuzz2 fizzbuzz = new FizzBuzz2();
		Assertions.assertThat(fizzbuzz.get(3)).isEqualTo("fizz");
	}
	
	@Test
	public void should_return_buzz_if_param_is_multiple_5() {
		FizzBuzz2 fizzbuzz = new FizzBuzz2();
		Assertions.assertThat(fizzbuzz.get(5)).isEqualTo("buzz");
	}
	
	@Test
	public void should_return_1_if_param_is_1() {
		FizzBuzz2 fizzbuzz = new FizzBuzz2() ;
		Assertions.assertThat(fizzbuzz.get(1)).isEqualTo( "1") ;
	}
	
	@Test
	public void should_return_buzz_if_param_is_15() {
		FizzBuzz2 fizzbuzz = new FizzBuzz2();
		Assertions.assertThat(fizzbuzz.get(15)).isEqualTo("fizz buzz");
	}
	
	@Test
	public void should_return_fizz_if_param_is_multiple_3_2() {
		FizzBuzz2 fizzbuzz = new FizzBuzz2();
		for (int i = 1; i < 42; i = i + 1) {
			if(i % 5 != 0) {
				Assertions.assertThat(fizzbuzz.get(3 * i)).isEqualTo("fizz");
			}
		}
	}
	
	@Test
	public void should_return_buzz_if_param_is_multiple_10() {
		FizzBuzz2 fizzbuzz = new FizzBuzz2();
		Assertions.assertThat(fizzbuzz.get(10)).isEqualTo("buzz");
	}
}

