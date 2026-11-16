/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int []arr = new int[10];
		int count = 0;
		int add = 9;
		while(count<9){
			arr[count] = add;
			add--;
			count ++;
		}
		count = 0;
		add = 9;
		while(count<10){
			System.out.println(arr[count]=add);
			count++;
			add--;
		}
		
	}
}
