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
		PooleDwarf Dwarf = new PooleDwarf(randName(), 13);
		
		PooleDwarf Dwarf1 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf2 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf3 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf4 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf5 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf6= new PooleDwarf(randName(), 13);
		int test = 0;
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		int test4 = 0;
		int test5 = 0;
		int test6 = 0;
		
		if(Dwarf.isSameName("Dopey")){
			test++;
		}
		if(Dwarf1.isSameName("Bashful")){
			test1++;
		}
		if(Dwarf2.isSameName("Grumpy")){
			test2++;
		}
		if(Dwarf3.isSameName("Sleepy")){
			test3++;
		}
		if(Dwarf4.isSameName("Sneezy")){
			test4++;
		}
		if(Dwarf5.isSameName("Happy")){
			test5++;
		}
		if(Dwarf6.isSameName("Doc")){
			test6++;
		}
		if((test>test1)&&(test>test2)&&(test>test3)&&(test>test4)&&(test>test5)&&(test>test6)){
			System.out.println("Dopey was the most common name with "+test+" matches");
		}
		if((test1>test)&&(test1>test2)&&(test1>test3)&&(test1>test4)&&(test1>test5)&&(test1>test6)){
			System.out.println("Bashful was the most common name with "+test1+" matches");
		}
		if((test2>test1)&&(test2>test)&&(test2>test3)&&(test2>test4)&&(test2>test5)&&(test2>test6)){
			System.out.println("Grumpy was the most common name with "+test2+" matches");
		}
		if((test3>test1)&&(test3>test2)&&(test3>test)&&(test3>test4)&&(test3>test5)&&(test3>test6)){
			System.out.println("Sleepy was the most common name with "+test3+" matches");
		}
		if((test4>test1)&&(test4>test2)&&(test4>test3)&&(test4>test)&&(test4>test5)&&(test4>test6)){
			System.out.println("Sneezy was the most common name with "+test4+" matches");
		}
		if((test5>test1)&&(test5>test2)&&(test5>test3)&&(test5>test4)&&(test5>test)&&(test5>test6)){
			System.out.println("Happy was the most common name with "+test5+" matches");
		}
		if((test6>test1)&&(test6>test2)&&(test6>test3)&&(test6>test4)&&(test6>test5)&&(test6>test)){
			System.out.println("Doc was the most common name with "+test6+" matches");
		}
		


	}
	
}
