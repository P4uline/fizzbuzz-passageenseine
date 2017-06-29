package fr.katas.fizzbuzz;

import java.util.OptionalDouble;

public class FizzBuzz2 {

	public String get(int i) {
		// TODO Auto-generated method stub
		if ((i % 3 == 0) && (i % 5 == 0)) {
			return "fizz buzz";
		}
		if(i % 3 == 0) {
			return "fizz";
		}
		else if (i % 5 == 0) {
			return "buzz";
		}
		return Integer.toString(i);
	}
}
