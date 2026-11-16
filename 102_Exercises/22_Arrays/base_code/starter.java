/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int num;
		
		int []arr = new int[1001];
		int []arr2 = new int[1001];
		
		int num3=0;
		while(num3<arr.length){
			arr[num3] = (num3+1)*3;
			num3++;
			
		}
		num3 = 0;
		
		
		while(num3<arr.length){
			System.out.println(arr[num3]);
			num3++;
		}

		int count = 1000;
		while(count>=0){
			arr2[count] = count - 1;
			count --;
			
		}
		count = 1000;

		while(count>=0){
			System.out.println(arr2[count]);
			count--;
			
		}
	}
}
