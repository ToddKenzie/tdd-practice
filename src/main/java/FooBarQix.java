
public class FooBarQix {

	public String convertToFooBarQix(int input) {

		String output = "";

		output += returnsFooIfDivisibleByThree(input);
		output += returnsBarIfDivisibleByFive(input);
		output += returnQixIfDivisibleBySeven(input);

		output += returnValuesForEachDigit(input);

		if (output.equals("")) {
			return output + input;
		} else {
			return output;
		}
	}

	private String returnQixIfDivisibleBySeven(int input) {
		if (input % 7 == 0) {
			return "Qix";
		}
		return "";
	}
	
	private String returnsBarIfDivisibleByFive(int input) {
		if (input % 5 == 0) {
			return "Bar";
		}
		return "";
	}
	
	private String returnsFooIfDivisibleByThree(int input) {
		if (input % 3 == 0) {
			return "Foo";
		}
		return "";
	}

	private String returnValuesForEachDigit(int input) {
		String digitBasedFooBarQix = "";
		for (int i = input; i > 0; i /= 10) {
			digitBasedFooBarQix = returnValueOfDigit(i) + digitBasedFooBarQix;
			}
		return digitBasedFooBarQix;
	}

	private String returnValueOfDigit(int input) {
		if (input % 10 == 3) {
			return "Foo";
		} else if (input % 10 == 5) {
			return "Bar";
		} else if (input % 10 == 7) {
			return "Qix";
		} else if (input % 10 == 0) {
			return "*";
		}
		return "";
	}

}
