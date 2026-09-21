/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter a integer: ");
		int x = sc.nextInt();
		
		System.out.print("Please enter another integer (Bigger than the first): ");
		int y = sc.nextInt();
		System.out.println();
		System.out.println("Your range is "+x+" to "+y+".");

		System.out.println("Here are 5 numbers generated in that range.");
	/////	y = y+1;
		//int z = (int)(Math.random()*(y));
		//z = Math.random()+z;
		System.out.println((int)(Math.random()*(y-x)+(x)));
		System.out.println((int)(Math.random()*(y-x)+(x)));
		System.out.println((int)(Math.random()*(y-x)+(x)));
		System.out.println((int)(Math.random()*(y-x)+(x)));
		System.out.println((int)(Math.random()*(y-x)+(x)));

	}
}
