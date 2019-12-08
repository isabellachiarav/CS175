package homework4;

import java.util.Scanner;

public class E63 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int input = 0, largest = -999999, smallest = 999999, even = 0, odd = 0, sum = 0, priorInput = 999999;
		String totals = "", adjacent = "";
		System.out.println("Enter a sequence of integers (enter 'STOP' to end): ");
		while (sc.hasNextInt()) {
			input = sc.nextInt();
			//Tests for adjacent duplicates
			if (input == priorInput) {
				adjacent += input + " ";
			}
			//Tests for largest and smallest inputs
			largest = Math.max(largest, input);
			smallest = Math.min(smallest, input);
			//Tests for even and odd inputs
			if (input % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			//Tests for cumulative totals
			sum += input;
			totals += sum + " ";
			priorInput = input;
			
		}
		
		//Prints all requirements
		System.out.println("Largest input: " + largest);
		System.out.println("Smallest input: " + smallest);
		System.out.println("Number of even inputs: " + even);
		System.out.println("Number of odd inputs: " + odd);
		System.out.println("Cumulative totals: " + totals);
		//Tests if adjacent duplicates are present
		if (adjacent != "") {
            System.out.printf("Adjacent duplicates: " + adjacent);
        }
        else {
            System.out.println("There are no adjacent duplicates.");
        }
		
		
		
//		Output:
//		Enter a sequence of integers (enter 'STOP' to end): 
//		1
//		2
//		2
//		3
//		4
//		4
//		5
//		6
//		7
//		8
//		9
//		9
//		STOP
//		Largest input: 9
//		Smallest input: 1
//		Number of even inputs: 6
//		Number of odd inputs: 6
//		Cumulative totals: 1 3 5 8 12 16 21 27 34 42 51 60 
//		Adjacent duplicates: 2 4 9 
		
	}//main

}//E63
