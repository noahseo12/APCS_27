/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String Owner;
	private int AccountNumber;
	private double balance;
	private boolean isActive;
	private static int nextAccountNumber = (int)(Math.random()*1950)+50;

	// -------CONSTRUCTORS-------

	
	public BankAccount(double b, String O){
		Owner = O;
		isActive = true;
		balance = b;
		AccountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
		
	}
		// -------METHODS-------
	private String Owner(){
		return Owner;

	}
	private int accountnumber(){
		return AccountNumber;
	}

	private double balance(){
		return balance;
	}
	private boolean isActive(){
		return isActive;
	}
}