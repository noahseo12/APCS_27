/*
 *	Author:  Noah Seo
 *  Date: 10/15/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a number");

		int x = sc.nextInt();

		System.out.println("Give me a number");
		int y = sc.nextInt();
		System.out.println("This is "+x+" to the "+y+" power.");
		System.out.println(pow(x,y));



		
	}
	public static int pow(int x,int y){
		
		
		if(y==1){
			return x;
		}
		else if(y==2){
			return x*x;
		}
		else if(y==0){
			
			return 1;
		}
		else{
			while(y>2){
				x=x*x;
				y= y-1;
				if(y==0){
					
					break;
				}
			}
			return x;
		}
		
	}
}
