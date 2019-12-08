package homework4;

import java.util.Scanner;

public class P64 {

	public static void main(String[] args) {
		
		int input = 0;
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter an integer: ");
		input = sc.nextInt();
		
		System.out.print("Factors of " + input + ": ");
		for (int i = 2; i <= input;) {
			if (input % i == 0) {
				System.out.print(i + " ");
				input /= i;
			}
			else {
				i++;
			}
		}

		
		
//		Output:
//		Enter an integer: 150
//		Factors of 150: 2 3 5 5 
		
	}

}
