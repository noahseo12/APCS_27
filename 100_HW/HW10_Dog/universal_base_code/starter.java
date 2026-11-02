/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String name = sc.nextLine();
		System.out.println("What age should "+name+" be?");
		int age = sc.nextInt();
		Dog max = new Dog(name,age);
		System.out.println(name+" is a dog dog that is "+ age+" years old!");
		Dog charlie = new Dog("Charlie", 10);
		System.out.println("Charlie is a dog dog that is 10 years old!");
		
		if(max.isSleeping()){
			System.out.println(max.getName()+" is asleep.");
		}
		else{
			max.bark();
		}
		if(charlie.isSleeping()){
			if(max.isSleeping()==false){
				charlie.bark();
			}
			
		}
		else{
			if((max.isSleeping()) == false){
				charlie.bark();
			}
		}



	}
}
