/*
 *	Author:Noah Seo
 *  Date:9/22/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Fortune cookie Generator!");
		int fortune = (int)(Math.random()*11)+1;
		if(fortune == 1){
			System.out.println("you will be lucky");
		}
		
		if(fortune == 2){
			System.out.println("you will be betrayed by a loved one");
		}
		
		if(fortune == 3){
			System.out.println("your goals will soon be acheived");
		}
		
		if(fortune == 4){
			System.out.println("you gonna die");
		}
		
		if(fortune == 5){
			System.out.println("you will be soon consumed by the devil");
		}
		
		if(fortune == 6){
			System.out.println("You will lose all your money");
		}
		
		if(fortune == 7){
			System.out.println("as the sun nears the moon in a solar eclipse, a familiar face will determine your fate.");
		}
		
		if(fortune == 8){
			System.out.println("you will lose all of your belongings");
		}
		
		if(fortune == 9){
			System.out.println("you will be not be lucky");
		}
		
		if(fortune == 10){
			System.out.println("you will meet a famous person");
		}
		
	}
}
