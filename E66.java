package homework4;

import java.util.Scanner;

public class E66 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		float input = 0, sum = 0, avg = 0, largest = -999999, smallest = 999999, range = 0;
		int count = 0;
		System.out.println("Enter a set of floating-point values (type any letter to quit): ");
		while (sc.hasNextFloat()) {
			input = sc.nextFloat();
			//Calculates sum and count to use for average calculation
			sum += input;
			count++;
			//Calculates smallest and largest values
			largest = Math.max(largest, input);
			smallest = Math.min(smallest, input);
		}
		
		//Calculates average value and range between smallest and largest
		avg = sum / count;
		range = largest - smallest;
		
		//Prints all calculations to user
		System.out.println("Average value: " + avg);
		System.out.println("Smallest value: " + smallest);
		System.out.println("Largest value: " + largest);
		System.out.println("Range between smallest and largest value: " + range);
		
		
		
//		Output:
//		Enter a set of floating-point values (type any letter to quit): 
//		3.9
//		4.5
//		1.3
//		8.7
//		S
//		Average value: 4.6
//		Smallest value: 1.3
//		Largest value: 8.7
//		Range between smallest and largest value: 7.3999996
			

	}//main

}//E66
