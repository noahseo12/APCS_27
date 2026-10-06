/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		//BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		//variables
		double item1Price =0.0;
		double item2Price = 0.0;
		double item3Price = 0.0;
		double shipping1 = 0.0;
		String yesno;
		String yesno2;
		double total;
		int fate;
		String item3 ="none";
		String item2 = "none";
		int endShop=0;
		

		//shop intro
		System.out.println("Welcome to Noah's Shop!");
		System.out.println();
		System.out.println("What is your name, user?");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.println("Hi, "+ name+ " !");
		System.out.println("Would you like to enter the shop");
		String enter = sc.nextLine();

		if(enter.equalsIgnoreCase("yes")){
		System.out.println();

		System.out.println("What would you like to purchase today?");
		//item 1
		String item1 = sc.nextLine();
		item1Price = ((Math.random()*101)+1);
		System.out.println();
		int sale1 = (int)(Math.random()*10)+1;
		if(sale1 >5){
		System.out.println("You dont get discount");
		}
		
		else if(sale1 <=5){
			
			int salePercent1 = (int)(Math.random()*100)+1;
			System.out.println("You get a discount of $"+salePercent1);
			item1Price = item1Price-salePercent1;

		}
		System.out.println("Your total for "+item1+" "+item1Price);
		System.out.println();
		System.out.println("Is that all you would like to purchase today?(yes or no)");
		yesno = sc.nextLine();
		
		if(yesno.equalsIgnoreCase("no")){
			System.out.println("What else would you like to purchase today?");
		//item 2
		item2 = sc.nextLine();
		item2Price = ((Math.random()*101)+1);
		System.out.println();
		int sale2 = (int)(Math.random()*10)+1;
		if(sale2 >5){
		System.out.println("You dont get discount");
		}
		
		else if(sale2 <=5){
			
			int salePercent2 = (int)(Math.random()*100)+1;
			System.out.println("You get a discount of $"+salePercent2);
			item2Price = item2Price-salePercent2;


		}
		System.out.println("Your total for "+item2+" "+item2Price);
		System.out.println();
		System.out.println("Is that all you would like to purchase today?(Yes or no)");
		yesno2 = sc.nextLine();
		
		//item 3
		if(yesno2.equalsIgnoreCase("no")){
			System.out.println("What else would you like to purchase today?");
		//item 3
		item3 = sc.nextLine();
		item3Price = ((Math.random()*101)+1);
		System.out.println();
		int sale3 = (int)(Math.random()*10)+1;
		if(sale3 >5){
		System.out.println("You dont get discount");
		}
		else if(sale3 <=5){
			
			int salePercent3 = (int)(Math.random()*100)+1;
			System.out.println("You get a discount of $"+salePercent3);
			item3Price = item3Price-salePercent3;


		}
		System.out.println("Your total for "+item3+" "+item3Price);
		System.out.println();
		endShop = 1;

		}
		//else if(yesno.equalsIgnoreCase("yes")||yesno2.equalsIgnoreCase("yes")||endShop==1){

		}
		System.out.println("---------- Checkout --------");
			shipping1 = (Math.random()*50)+10;
			total = item1Price+item2Price+item3Price+shipping1+(((item1Price+ item2Price+item3Price)+shipping1)/100);
			System.out.println("total: "+total);
			shipping1 = ((shipping1/100)*(item1Price+item2Price+item3Price));
			System.out.println();
			System.out.println(item1+": "+item1Price);
			System.out.println();
			System.out.println(item2+": "+item2Price);
			System.out.println();
			System.out.println(item3+": "+item3Price);
			System.out.println();
			System.out.println("Your shipping is "+ shipping1);
			System.out.println("Your tax is "+((item1Price+ item2Price+item3Price)+shipping1)/100);
			System.out.println();
			System.out.println("Your subtotal is "+ ((item1Price+ item2Price+item3Price)+shipping1));
			System.out.println();
			System.out.println("----------------------------------------");
			System.out.println("Your total is "+total);
			System.out.println();
			System.out.println("Shop again at Noah's Shop");
			fate = (int)(Math.random()*3)+1;
			if(fate == 1){
				System.out.println("You got scammed :)");
			}
			else if(fate ==2){
				System.out.println("You got your package safety");

			}
			else if(fate ==3){
				System.out.println("Your package was lost at sea");
			}

		}

			
		}	

		
	
}
