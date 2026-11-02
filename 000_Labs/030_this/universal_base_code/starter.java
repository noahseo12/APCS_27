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
		int test = 0;
		int test1 = 0;
		int test2 = 0;
		int test3 = 0;
		int test4 = 0;
		int test5 = 0;
		int test6 = 0;
		int ii= 0;
		while(ii<7){
			PooleDwarf Dwarf = new PooleDwarf(randName(), 13);
				
		for(int i =1; i<7; i++){
		if(Dwarf.isSameName("Dopey")){
			test++;
		}
		if(Dwarf.isSameName("Bashful")){
			test1++;
		}
		if(Dwarf.isSameName("Grumpy")){
			test2++;
		}
		if(Dwarf.isSameName("Sleepy")){
			test3++;
		}
		if(Dwarf.isSameName("Sneezy")){
			test4++;
		}
		if(Dwarf.isSameName("Happy")){
			test5++;
		}
		if(Dwarf.isSameName("Happy")){
			test6++;
		}
		
		}
		ii++;
		}
		/*
		PooleDwarf Dwarf = new PooleDwarf(randName(), 13);
		
		PooleDwarf Dwarf1 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf2 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf3 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf4 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf5 = new PooleDwarf(randName(), 13);
		PooleDwarf Dwarf6= new PooleDwarf(randName(), 13);
	*/
		if((test>test1)&&(test>test2)&&(test>test3)&&(test>test4)&&(test>test5)&&(test>test6)){
			System.out.println("Dopey was the most common name with "+test+" matches");
		}
		else if((test1>test)&&(test1>test2)&&(test1>test3)&&(test1>test4)&&(test1>test5)&&(test1>test6)){
			System.out.println("Bashful was the most common name with "+test1+" matches");
		}
		else if((test2>test1)&&(test2>test)&&(test2>test3)&&(test2>test4)&&(test2>test5)&&(test2>test6)){
			System.out.println("Grumpy was the most common name with "+test2+" matches");
		}
		else if((test3>test1)&&(test3>test2)&&(test3>test)&&(test3>test4)&&(test3>test5)&&(test3>test6)){
			System.out.println("Sleepy was the most common name with "+test3+" matches");
		}
		else if((test4>test1)&&(test4>test2)&&(test4>test3)&&(test4>test)&&(test4>test5)&&(test4>test6)){
			System.out.println("Sneezy was the most common name with "+test4+" matches");
		}
		else if((test5>test1)&&(test5>test2)&&(test5>test3)&&(test5>test4)&&(test5>test)&&(test5>test6)){
			System.out.println("Happy was the most common name with "+test5+" matches");
		}
		else{
			System.out.println("Doc was the most common name with "+test6+" matches");
		}
		


	}
	
}
