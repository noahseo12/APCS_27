/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//intro
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title?");
		String title = sc.nextLine();

		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		if((role.equalsIgnoreCase("Wizard"))){
			System.out.println("You've chosen to be a Wizard! Excelsior!");
		}
			else if((role.equalsIgnoreCase("Warrior"))){
			System.out.println("You've chosen to be a Warrior! For honor!");
			} 
			else if((role.equalsIgnoreCase("Rogue"))){
			System.out.println("You've chosen to be a Rogue! How cunning!");
			}
			else{
			System.out.println("You've decided not to chose a role. Rerun program");
			}






			//if((role.equals("wizard"))){
			//System.out.println("You've chosen to be a Wizard! Excelsior!");
			//}
			//else if((role.equals("warrior"))){
			//System.out.println("You've chosen to be a Warrior! For honor!");
			//} 
			//else if((role.equals("rogue"))){
			////System.out.println("You've chosen to be a Rogue! How cunning!");
			//}
			//else{
			//System.out.println("You've decided not to chose a role. Rerun program");
			//}

		//skill points
			if((role.equalsIgnoreCase("Wizard"))|role.equalsIgnoreCase("Warrior")|role.equalsIgnoreCase("rogue")){
			System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely");

			int strength = 0;
			int Dexterity =0;
			int Intelligence=0;
			int Constitution=0;
			int Charisma=0;




			
			//strength
			System.out.print("Strength (1-10): ");
			strength = sc.nextInt();
			int pointsleft=20;
			if(strength <=10){
				pointsleft= 20-strength;
				System.out.println("You have "+pointsleft+" to spend");
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			}
			
			if(strength > 10){
				System.out.print("please input a smaller value. Strength (1-10): ");
				strength = sc.nextInt();
				pointsleft = 20-strength;
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			}
			
			

	
			//dexterity
			if(pointsleft>0){
			System.out.print("Dexterity (1-10): ");
			Dexterity= sc.nextInt();
			if(Dexterity <=10){
				pointsleft= pointsleft-Dexterity;
				System.out.println("You have "+pointsleft+" to spend");
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			}
			
			
			if(Dexterity >10){
				System.out.print("please input a smaller value. dexterity (1-10): ");
				Dexterity = sc.nextInt();
				pointsleft = pointsleft-Dexterity;
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			}
			}
			

	
			//intelligence
			if(pointsleft>0){
			
			
			System.out.print("Intelligence (1-10): ");
			Intelligence= sc.nextInt();
			if(Intelligence <=10){
				pointsleft= pointsleft-Intelligence;
				System.out.println("You have "+pointsleft+" to spend");
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			
			
			if(Intelligence > 10){
				System.out.print("please input a smaller value. intelligence (1-10): ");
				Intelligence = sc.nextInt();
				pointsleft = pointsleft-Intelligence;
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			}
			}
			}
			
			

	
			//constitution
			if(pointsleft>0){
			
			System.out.print("Constitution (1-10): ");
			Constitution= sc.nextInt();
			if(Constitution <=10){
				pointsleft= pointsleft-Constitution;
				System.out.println("You have "+pointsleft+" to spend");
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			
			
			if(Constitution > 10){
				System.out.print("please input a smaller value. constituion (1-10): ");
				Constitution = sc.nextInt();
				pointsleft = pointsleft-Constitution;
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			}
			
			}
			}

	
			
			
			if(pointsleft>0){
			
			System.out.print("Charisma (1-10): ");
			Charisma= sc.nextInt();
			if(Charisma <=10){
				pointsleft= pointsleft-Charisma;
				System.out.println("You have "+pointsleft+" to spend");
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			
			
			if(Charisma > 10){
				System.out.print("please input a smaller value. charisma (1-10): ");
				Charisma = sc.nextInt();
				pointsleft = pointsleft-Charisma;
				if(pointsleft<0){
				System.out.println("You have no more points left to spend.");
			}
			}
			}
			}
			if(pointsleft>0){
			System.out.println("You have "+pointsleft+" to spend for next time.");
			}
			System.out.println("--------------------------------------------------------------");
			System.out.println("You are "+name+", the "+title+" of CVHS.");
			System.out.println("You are a "+role+" with the following stats!");
			System.out.println("Strength - "+strength);
			if(Dexterity>=0){
			System.out.println("Dexterity - "+Dexterity);
			}
			if(Intelligence>=0){
			System.out.println("Intelligence - "+Intelligence);
			}
			if(Constitution>=0){
			System.out.println("Constitution - "+ Constitution);
			}
			if(Charisma>=0){
			System.out.println("Charisma - "+ Charisma);
			}
			System.out.println();
			System.out.println("Good luck on your quest "+name+"!");
			
			}
			else{
				System.out.println("you dumb");
			}
			}

	
			
	}
			

			
			
	
	
	
	

