/*
 *	Author:Noah Seo
 *  Date:10/9/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int random1 = (int)(Math.random()*10)+1;
		int random2 = (int)(Math.random()*10)+1;
		int random3 = (int)(Math.random()*10)+1;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers meatch, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) : ");	
		String choice = sc.nextLine();
		boolean choiceTrue = choice.equalsIgnoreCase("yes");
		boolean choiceTrue2 = choice.equalsIgnoreCase("y");
		boolean choiceFalse = choice.equalsIgnoreCase("no");
		boolean choiceFalse2 = choice.equalsIgnoreCase("n");
		if(choiceTrue||choiceTrue2){
			while(choiceTrue||choiceTrue2){
				
			
			
			System.out.print("You have $"+money+". How much would you like to wager? ");
			
			int wager = sc.nextInt();
			sc.nextLine();
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			random1 = (int)(Math.random()*10)+1;
			random2 = (int)(Math.random()*10)+1;
			random3 = (int)(Math.random()*10)+1;
			System.out.println();
			System.out.println(" ________________________");
			System.out.println("|                        |");
			System.out.println("|       "+random1+"|"+random2+"|"+random3+"|"+"          |");
			System.out.println("|                        |");
			System.out.println(" ________________________");
				if(random1==random2||random2==random3||random1==random3||random2==random3){
					if(random1==random2&&random1==random3){
						System.out.println("You won! Your wager has now been tripled");
						money = (wager*3)+money;
						System.out.println("You now have $"+money);
						System.out.println("Would you like to play again?");
						choice = sc.nextLine();
						
					}
					else{
					System.out.println("You won! Your wager has now been doubled");
						money =(wager*2)+money;
						System.out.println("You now have $"+money);
						
						System.out.println("Would you like to play again?");
						choice = sc.nextLine();
				
		
					}
				}
				else{
					System.out.println("You lost.");
					money = money-wager;
					System.out.println("You have $"+money+"left");
					System.out.println("Would you like to play again?");
						choice = sc.nextLine();
					if(money ==0){
					break;
					}
				}
		
				
			}
		}
		
	}
}
