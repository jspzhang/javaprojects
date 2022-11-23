package romanToInt;

import java.util.Scanner;

/*
  @author jspzhang
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
	Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9. 
    X can be placed before L (50) and C (100) to make 40 and 90. 
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
*/

//Roman letters to Integer
public class Solution {
	// static method to execute the function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("Please input valid roman letters(I,V,X,L,C,D,M), or Q to exit:");
			String roman = scanner.nextLine();

			if (roman.charAt(0) == 'Q') {
				// System.out.println("Quit line!");
				running = false;
				System.exit(0);
			}

			for (int i = 0; i < roman.length(); i++) {
				if (roman.charAt(i) != 'I' && roman.charAt(i) != 'V' && roman.charAt(i) != 'X' && roman.charAt(i) != 'L'
						&& roman.charAt(i) != 'C' && roman.charAt(i) != 'D' && roman.charAt(i) != 'M') {
					// System.out.println("Please input valid roman letters!");
					break;
				}
			}

			int int_number = 0;

			Solution solution = new Solution();
			try {
				int_number = solution.romanToInt(roman);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (int_number != 0) {
				System.out.println("The integer number for " + roman + " in roman format is: " + int_number);
			}
		}
		scanner.close();

	}

	// Method to transfer Roman numeral to integer
	public int romanToInt(String s) {
		int number = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				if (i < (s.length() - 1) && s.charAt(i + 1) == 'V') {
					number += 4;
					i++;
					continue;
				} else if (i < (s.length() - 1) && s.charAt(i + 1) == 'X') {
					number += 9;
					i++;
					continue;
				} else {
					number += 1;
				}

			}

			if (s.charAt(i) == 'X') {
				if (i < (s.length() - 1) && s.charAt(i + 1) == 'L') {
					number += 40;
					i++;
					continue;
				} else if (i < (s.length() - 1) && s.charAt(i + 1) == 'C') {
					number += 90;
					i++;
					continue;
				} else {
					number += 10;
				}

			}

			if (s.charAt(i) == 'C') {
				if (i < (s.length() - 1) && s.charAt(i + 1) == 'D') {
					number += 400;
					i++;
					continue;
				} else if (i < (s.length() - 1) && s.charAt(i + 1) == 'M') {
					number += 900;
					i++;
					continue;
				} else {
					number += 100;
				}

			}

			if (s.charAt(i) == 'V') {
				number += 5;
			}

			if (s.charAt(i) == 'L') {
				number += 50;
			}

			if (s.charAt(i) == 'D') {
				number += 500;
			}

			if (s.charAt(i) == 'M') {
				number += 1000;
			}

		}
		return number;
	}

}