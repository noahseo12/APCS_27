/*
 *	Author:  Noah Seo
 *  Date: 10/15/26
*/

import java.util.Scanner;

class starter {
	public static void toString(String a){
		
			System.out.println("This is using methods");
			System.out.println(a);
			return;

		}
	
	

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence");
		String a = sc.nextLine();
		toString(a);
		System.out.println("Write a sentence");
		String b = sc.nextLine();
		System.out.println("Write a sentence");
		String c = sc.nextLine();
		toStringCombined(b, c);
		



		
	}
	public static void toStringCombined(String b, String c){
		Scanner sc = new Scanner(System.in);
		System.out.println("This is using methods");
		System.out.println(b);
		System.out.println("This is using methods");
		System.out.println(c);
		
		return;
		
		
	//}

	//public static int add(int a, int b){
		
	//	return a;
	//}

}
}
