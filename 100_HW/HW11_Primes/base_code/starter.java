/*
 *	Author:Noah Seo
 *  Date:11/2/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this p
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int number = sc.nextInt();
		printPrimes(number);
	}
	public static boolean checkPrime(int n){
		int a = 2;
		while(a<n){
			if(n%a!=0){
				a++;
			}
			else{
				
				return false;
		}
		
	}
	return true;
	}
	public static void printPrimes(int n){
		int a=2;
		while(a<=n){
			if(checkPrime(a)){
				System.out.println(a);
				a++;
			}
			
				a++;
			
		

		}
		return;
	}
}
