package homework4;

import java.util.Scanner;

public class E64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		String uppercase = "", secondLetter = "", underscore = null, vowelPosition = "";
		int vowelCount = 0;
		System.out.println("Enter a string: ");
		String input = sc.nextLine();

		//Prints uppercase letters in input
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				uppercase += input.charAt(i) + " ";
			}
		}
		System.out.println("Uppercase letters: " + uppercase);
		
		//Prints every second letter of the string
		if (input.length() < 2) {
			System.out.print("The string only contains one character.");
		}
		else {
			for (int i = 1; i < input.length(); i += 2) {
				secondLetter += input.charAt(i) + " ";
			}
			System.out.println("Every second letter: " + secondLetter);
		}
		
		//Prints the string with all vowels replaced by an underscore
		underscore = input.replaceAll("a|e|i|o|u|A|E|I|O|U", "_");
		System.out.println("All vowels replaced by underscores: " + underscore);
		
		//Prints number of vowels in the string
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || 
					input.charAt(i) == 'e' || input.charAt(i) == 'E' ||
					input.charAt(i) == 'i' || input.charAt(i) == 'I' || 
					input.charAt(i) == 'o' || input.charAt(i) == 'O' ||
					input.charAt(i) == 'u' || input.charAt(i) == 'U') {
				vowelCount++;
				vowelPosition += (i + 1) + " ";
			}
		}
		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Vowel positions: " + vowelPosition);
		
		
		
//		Output:
//		Enter a string: 
//		IsabellA
//		Uppercase letters: I A 
//		Every second letter: s b l A 
//		All vowels replaced by underscores: _s_b_ll_
//		Number of vowels: 4
//		Vowel positions: 1 3 5 8
		

	}//main

}//E64
