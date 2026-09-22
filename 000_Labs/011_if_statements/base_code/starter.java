/*
 *	Author:  Noah Seo
 *  Date: 9/21/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int x = 4;
		int y = 4;
		boolean yes = x == y;
		boolean no = x!=y;
		
		System.out.println("The first variable is: "+x);
		System.out.println("The second variable is: "+y);
		if(yes){
			System.out.println("X and y are the same");
		}
		if(no){
			System.out.println("X and y  are not the same");
		}
	}
}
