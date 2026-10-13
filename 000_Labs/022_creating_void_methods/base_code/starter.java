/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void toString(String a){
		
			System.out.println("This is using methods");
			System.out.println(a);

		}
	
	

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence");
		String input = sc.nextLine();
		toString(input);


		
	}
	public static void toStringCombined(String b, String c){
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence");
		b = sc.nextLine();
		System.out.println("Write a sentence");
		c = sc.nextLine();
		System.out.println(b+" "+c);
		
		
		
	//}

	//public static int add(int a, int b){
		
	//	return a;
	//}

}
