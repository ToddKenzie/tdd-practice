
public class RomanNumerals {

	public String ConvertToRomanNum(int number) {
		String output = "";
		
		//hundreds place
		for (int i = number; i >= 1000; i -= 1000) {
			output += "M";
		}
		
		int valueInHundredsPlace = number % 1000;
		if (valueInHundredsPlace >= 400 && valueInHundredsPlace <= 499) {
			output += "CD";
		} else if (valueInHundredsPlace >= 900) {
			output += "CM";
		} else if  (valueInHundredsPlace >= 500 && valueInHundredsPlace<= 899) {
			output += "D";
		}
		
		int valueInHundredsPlaceInto500 = number % 500;
		if (valueInHundredsPlaceInto500>= 100 && valueInHundredsPlaceInto500<= 399) {
			for (int i = valueInHundredsPlaceInto500; i >= 100; i -= 100) {
				output += "C";
			}
		}
		
		//tens place
		int valueInTensPlace = number % 100;
		if (valueInTensPlace >= 40 && valueInTensPlace <= 49) {
			output += "XL";
		} else if (valueInTensPlace >= 90) {
			output += "XC";
		} else if  (valueInTensPlace >= 50 && valueInTensPlace<= 89) {
			output += "L";
		}
		
		int valueInTensPlaceInto50 = number % 50;
		if (valueInTensPlaceInto50 >= 10 && valueInTensPlaceInto50<= 39) {
			for (int i = valueInTensPlaceInto50; i >= 10; i -= 10) {
				output += "X";
			}
		}
		
		
		//ones place
		int valueInOnesPlace = number % 10;
		if (valueInOnesPlace == 4) {
			output += "IV";
		} else if (valueInOnesPlace== 9) {
			output += "IX";
		} else if  (valueInOnesPlace >= 5 && valueInOnesPlace <= 8) {
			output += "V";
		}
		
		if (number % 5 > 0 && number % 5 <= 3) {
			for (int i = number % 5; i > 0; i--) {
				output += "I";
			}
		}
		
		return output;
	}

}
