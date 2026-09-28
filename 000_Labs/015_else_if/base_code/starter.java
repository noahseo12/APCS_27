/*
 *	Author:  Noah Seo
 *  Date: 9/22/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Pick anumber between 1 - 1000: ");
		int number = sc.nextInt();
		int random = (int)(Math.random()*1001)+1;
		boolean answer = number == random;
		boolean answer2 = number>random;
		boolean answer3 = number<random;
		if (answer){
			System.out.println("You guessed the number!");

		}
		else if(answer2){
			System.out.println("Your number was higher than the random number. The number was "+ random);
		}
		else if(answer3){
			System.out.println("Your number was smaller than the random number. The number was "+ random);

		}
		
	}
}
