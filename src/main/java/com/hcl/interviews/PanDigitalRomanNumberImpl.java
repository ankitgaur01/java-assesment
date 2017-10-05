package com.hcl.interviews;

public class PanDigitalRomanNumberImpl implements PanDigitalRomanNumber {

	// array of numbers
	private static int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	// array of romanLetters
	private static String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	
	/**
	 * This method will convert from the integer value to Roman value.
	 * @param number
	 * @return romanValue
	 */
	
	@Override
	public String checkNumber(int input) {
		String romanValue = "";
		for (int i = 0; i < numbers.length; i++) {
			while (input >= numbers[i]) {
				romanValue += romanLetters[i];
				input -= numbers[i];
			}
		}
		return romanValue;
	}

}
