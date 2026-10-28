/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman x = new Spiderman("Tom Holland", 27, "Vulture");
		System.out.println("Actor: "+x.getActor());
		System.out.println("Age: "+x.getAge());
		System.out.println("Villain: "+x.getVillain());

		Spiderman TM = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		System.out.println("Actor: "+TM.getActor());
		System.out.println("Age: "+TM.getAge());
		System.out.println("Villain: "+TM.getVillain());

		Spiderman AG = new Spiderman("Andrew Garfield", 40, "Electro");
		System.out.println("Actor: "+AG.getActor());
		System.out.println("Age: "+AG.getAge());
		System.out.println("Villain: "+AG.getVillain());

		Spiderman MM = new Spiderman("Miles Morales", 30, "Spot");
		System.out.println("Actor: "+MM.getActor());
		System.out.println("Age: "+MM.getAge());
		System.out.println("Villain: "+MM.getVillain());
		
		
		
	}
}
