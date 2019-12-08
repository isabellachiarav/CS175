package homework4;

import java.util.Scanner;

public class E611 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int vowelCount = 0;
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		//Prints number of vowels in the string
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'A' || 
					input.charAt(i) == 'e' || input.charAt(i) == 'E' ||
					input.charAt(i) == 'i' || input.charAt(i) == 'I' || 
					input.charAt(i) == 'o' || input.charAt(i) == 'O' ||
					input.charAt(i) == 'u' || input.charAt(i) == 'U' ||
					input.charAt(i) == 'y' || input.charAt(i) == 'Y') {
				vowelCount++;
			}
		}
		System.out.println("Number of vowels: " + vowelCount);
		
		
		
//		Output:
//		Enter a string: 
//		Harry
//		Number of vowels: 2

	}//main

}//E611
