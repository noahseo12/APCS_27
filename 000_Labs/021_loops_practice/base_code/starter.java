/*
 *	Author:  Noah Seo
 *  Date: 10/8/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This is a guessing game.");
		System.out.println("Guess a number between 1 - 1000");
		int correctAnswer = (int)((Math.random())*1000)+1;
		int number = sc.nextInt();
		if(number == correctAnswer){
			System.out.println("You guessed the number!");
		}
		while(number != correctAnswer){
			if(number == correctAnswer){
		
				break;
			}
			else if(number > correctAnswer){
				System.out.println("Your guess is higher than the number!");
			}
			else if(number < correctAnswer){
				System.out.println("Your guess is lower than the number!");
			}
			System.out.println("Guess again");
			number = sc.nextInt();
		}
		System.out.println("You guessed the number");



		
	}
}
