/*
 *	Author:  Noah Seo
 *  Date: 10/6/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do I print your name?");
		int number = sc.nextInt();
		int numer = number+number;
		while(number == number ){
			if(number==numer){
				break;
			}
			System.out.println(name);
			number = number+1;
		}



		
	}
}
