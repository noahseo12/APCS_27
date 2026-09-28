/*
 *	Author:Noah Seo
 *  Date:9/23/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int num2 = sc.nextInt();

		

		if((num1%2)==1){
			System.out.println("Your first number is an odd");
		}
		else if((num1%2)==0){
			System.out.println("Your first number is an even");
		
		}
		if((num2%2)==1){
			System.out.println("Your second number is an odd");
		}
		else if((num2%2)==0){
			System.out.println("Your second number is an even");
		
		}
		if(((num1%3)==0)){
			System.out.println("Your first number is divisible by 3");

		}
		else if((num1%4)==0){
			System.out.println("Your first number is divisible by 4");

		}
		else if ((num1%5)==0){
			System.out.println("Your first number is divisible by 5");
		}
		else{
			System.out.println("Your first number is not divisible by 3, 4, or 5");
		}
		if(((num1%3)==0)){
			System.out.println("Your second number is divisible by 3");

		}
		else if((num1%4)==0){
			System.out.println("Your second number is divisible by 4");

		}
		else if ((num1%5)==0){
			System.out.println("Your second number is divisible by 5");
		}
		else{
			System.out.println("Your second number is not divisible by 3, 4, or 5");
		}
}	
}