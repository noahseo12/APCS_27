/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.raiseSalary(10);
		Dwight.employeeToString();
		System.out.println("Annual salary: "+Dwight.getAnnualSalary());
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.raiseSalary(10);
		Jim.employeeToString();
		System.out.println("Annual salary: "+Jim.getAnnualSalary());
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.raiseSalary(10);
		Pam.employeeToString();
		System.out.println("Annual salary: "+Pam.getAnnualSalary());
		Employee Noah = new Employee(1000, "Noah", "Seo", 9999);
		Noah.raiseSalary(999);
		Noah.employeeToString();
		System.out.println("Annual salary: "+Noah.getAnnualSalary());

		
		
		
		
	}
}
