/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		
		int []arr = new int[20];
		int[]dupicate = new int[11];
		int []count = new int[11];
		for(int i = 1; i<20;i++){
			arr[i] = (int)(Math.random()*10)+1;
		}
		for(int i = 1; i<11;i++){
			dupicate[i] = i;
		}
		for(int i = 1; i<11;i++){
			count[i]=0;

		}
		for(int i = 1; i<10;i++){
			
			if(dupicate[i] == arr[i]){
				count[i]++;
				
			}
		}
		for(int i = 1; i<10;i++){
			if(count[i]>0){
				System.out.println("there was "+count[i]+" duplicate of "+ i);
			}
		}
		for(int i = 1; i<10;i++){
			if(arr[i]==arr[i+1]){
				System.out.println("Two consecutive numbers are "+arr[i]+" and "+(arr[i+1]));
			}
		}
	}
}
