/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf(rand, 13);
		
		PooleDwarf test1 = new PooleDwarf(rand, 13);
		PooleDwarf test2 = new PooleDwarf(rand, 13);
		PooleDwarf test3 = new PooleDwarf(rand, 13);
		PooleDwarf test4 = new PooleDwarf(rand, 13);
		PooleDwarf test5 = new PooleDwarf(rand, 13);
		PooleDwarf test6 = new PooleDwarf(rand, 13);
		int test = 0;
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		int test4 = 0;
		int test5 = 0;
		int test6 = 0;
		
		if(test.isSameName("Dopey")){
			test++;
		}
		test1.isSameName("Bashful");
		test2.isSameName("Grumpy");

		test3.isSameName("Sleepy");
		test4.isSameName("Sneezy");
		test5.isSameName("Happy");

		test6.isSameName("Doc");
		
		



	}
}
