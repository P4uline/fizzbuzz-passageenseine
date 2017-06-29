package fr.katas.fizzbuzz;


public class FizzBuzz {

	public String execute(int i) {
		if (i == 0) {
			return "0";
		}
		if ((i % 3 == 0) && (i % 5 == 0)) {
			return "fizzbuzz";
		}
		if (i % 3 == 0) {
			return "fizz";
		}
		if (i % 5 == 0) {
			return "buzz";
		}
		return String.valueOf(i);
	}

}
