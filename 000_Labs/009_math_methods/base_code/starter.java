/*
 *	Author:  Noah Seo
 *  Date: 9/9/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Type a value for x"); 
		int x = sc.nextInt();
		System.out.println("Type a value for y");
		int y = sc.nextInt();
		System.out.println(Math.max(x,y));
		
		System.out.println(Math.sqrt(y));
		System.out.println(Math.pow(x,y));
	}
}
