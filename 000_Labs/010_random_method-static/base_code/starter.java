/*
 *	Author:  Noah Seo
 *  Date: 9/10/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//int x = (int)Math.random()*9;
		//int y = (int)Math.random()*100;
		//System.out.println(x); 
		//System.out.println(y);
		//double x = Math.random()*9;
		double x = (int)(Math.random()*10);
		System.out.print("A number between 0 - 9: ");
		System.out.println(x);

		double y = (int)(Math.random()*(101));
		System.out.print("A number between 1 - 100: ");
		System.out.println(y);

		System.out.print("A number between 2.5 - 3.5: ");
		System.out.println(Math.random()*(2.5+3.5));

		System.out.print("A number between 14 - 589: ");
		System.out.println(Math.random()*(14+589));

		//double z = (Math.random()*)


	}
}
