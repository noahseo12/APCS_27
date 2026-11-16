/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int []arr = new int[150];
		int total = 0;
		int max = Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*100)+1;
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				arr[i]= max;
			}
			total = arr[i]+ total;

			

		}
		int average = total / 150;
		System.out.println("average: "+average);
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		
		
		

		
	}
}
