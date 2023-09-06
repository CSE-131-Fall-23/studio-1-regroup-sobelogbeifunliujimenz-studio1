package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double n1 = in.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = in.nextInt();
		double average = ((n1+n2)/2);
		
		System.out.print("The average of the two numbers is: " +average);

	}

}
