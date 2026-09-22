/*
 *	Author:  Noah Seo
 *  Date: 9/21/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Please input your first number: ");
		int x = sc.nextInt();
		System.out.print("Please input your second number: ");
		int y = sc.nextInt();

		boolean yes = x == y;
		boolean no = x!=y;
		if(yes){
			System.out.println("Your numbers are the same.");
		}
		if(no){
			System.out.println("Your numbers are different.");
	}
}
}
