/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The goal of the game is to guess a word with two hints!");
		
		System.out.println();

		int game = (int)(Math.random()*3)+1;
		
		if(game == 3){
			System.out.println("It's an animal that lives in the ocean");
			System.out.print("What is your guess? ");
			String shark = sc.nextLine();
			boolean shark1 = shark.equals("shark");
			boolean shark2 = shark.equals("Shark");
			if((shark1) || (shark2)){
				System.out.println("You guessed correctly!");
			}
			else{
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println();
				System.out.println("It has a lot of teeth");
				String shark3 = sc.nextLine();
				boolean shark4 = shark3.equals("shark");
				boolean shark5 = shark3.equals("Shark");
				if(shark4 || shark5){
					System.out.println("You guessed correctly!");
					
				}
				
			}
		}




		if(game == 2){
			System.out.println("It's an fast food company ");
			System.out.print("What is your guess? ");
			String dominos = sc.nextLine();
			boolean dominos1 = dominos.equals("dominos");
			boolean dominos2 = dominos.equals("Dominos");
			if((dominos1) || (dominos2)){
				System.out.println("You guessed correctly!");
			}
			else{
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println();
				System.out.println("Its a pizza place");
				String dominos3 = sc.nextLine();
				boolean dominos4 = dominos3.equals("dominos");
				boolean dominos5 = dominos3.equals("Dominos");
				if((dominos4) || (dominos5)){
					System.out.println("You guessed correctly!");
					
				}
				
			}
		}
		if(game == 1){
			System.out.println("It's a sport");
			System.out.print("What is your guess? ");
			String tennis = sc.nextLine();
			boolean tennis1 = tennis.equals("tennis");
			boolean tennis2 = tennis.equals("Tennis");
			if((tennis1) || (tennis2)){
				System.out.println("You guessed correctly!");
			}
			else{
				System.out.println();
				System.out.println("You sadly didn't guess right, here's another hint!");
				System.out.println();
				System.out.println("You use a racket");
				String tennis3 = sc.nextLine();
				boolean tennis4 = tennis3.equals("tennis");
				boolean tennis5 = tennis3.equals("Tennis");
				if(tennis4 || tennis5){
					System.out.println("You guessed correctly!");
					
				}
				
			}
		}
			
		
			
		
			
		
		
		
		
		
		
		
		
		
	
	}
}
