/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==============================================");
		System.out.println("          WELCOME RESTAURANT OWNER!");
		System.out.println("==============================================");
		System.out.println();
		System.out.print("What's the name of your restaurant? ");
		
		String name1 = sc.nextLine();

		System.out.println();

		System.out.print("What's your name? ");

		String name2 = sc.nextLine();
		
		System.out.println();

		System.out.println("Great to see you, "+name2+"! Let's set up a menu for "+name1+"!\nTonight's menu has room for exactly 3 items. Let's go!");

		System.out.println();

		//item 1

		System.out.println("--- Item #1 ---");
		System.out.print("Item name: ");

		String food1 = sc.nextLine();

		System.out.print("Price of "+food1+" ($): ");

		double foodPrice1 = sc.nextDouble();
		//sc.nextDouble();
		
		System.out.print("How many "+food1+" would you like? ");

		int foodQuant1 = sc.nextInt();
		//sc.nextInt();
		System.out.println("Added "+foodQuant1+"x "+ food1+" to your order! ($"+foodPrice1*foodQuant1+")");

		System.out.println();

		//item 2

		sc.nextLine();

		System.out.println("--- Item #2 ---");
		System.out.print("Item name: ");

		
		String food2 = sc.nextLine();

		//sc.nextDouble();

		//sc.nextLine();
		System.out.print("Price of "+food2+" ($): ");
		//sc.nextDouble();

		double foodPrice2 = sc.nextDouble();
		//sc.nextDouble();
		System.out.print("How many "+food2+" would you like? ");
		//sc.nextInt();
		//sc.nextDouble();
		int foodQuant2 = sc.nextInt();
		//sc.nextInt();
		System.out.println("Added "+foodQuant2+"x "+ food2+" to your order! ($"+foodPrice2*foodQuant2+")");

		//item 3

		sc.nextLine();
		System.out.println();
		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");

		String food3 = sc.nextLine();

		System.out.print("Price of "+food3+" ($): ");
		//sc.nextDouble();
		double foodPrice3 = sc.nextDouble();
		//scanner.nextInt();
		System.out.print("How many "+food3+" would you like? ");

		int foodQuant3 = sc.nextInt();
		System.out.println("Added "+foodQuant3+"x "+ food3+" to your order! ($"+foodPrice3*foodQuant3+")");

		System.out.println();

		System.out.print("Nice choices! What tip percentage would you like to leave? (Ex: 15,18,20) ");
		double tip = sc.nextDouble();

		System.out.println();

		System.out.println("==================================================");
		System.out.println("             "+name1+" - Menu For Today     ");
		System.out.println("Owner: "+ name2);
		System.out.println("--------------------------------------------------");
		System.out.println("Item              Qty    Price                    ");
		System.out.println(food1+"            "+foodQuant1+"    "+foodPrice1);
		System.out.println(food2+"            "+foodQuant2+"    "+foodPrice2);
		System.out.println(food3+"            "+foodQuant3+"    "+foodPrice3);
		System.out.println("--------------------------------------------------");
		double subTotal = foodPrice1+foodPrice2+foodPrice3;
		System.out.println("Subtotal:                "+subTotal);
		double tax = subTotal*9.75;
		System.out.println("Tax (9.75%):             "+tax);
		double tipTotal = (tip/100)*subTotal;
		System.out.println("Tip:                     "+tip);
		System.out.println("Tip Amount:              "+tipTotal);
		System.out.println("=================================================");
		double total = subTotal+tipTotal+tax;
		System.out.println("TOTAL:                   "+total);
		System.out.println("=================================================");
		System.out.println();
		System.out.println("Thank you for eating at "+name1+"!");
		System.out.println("Come back soon -- we'll alaways have a byte for you!");
	


		

		



	}
}
