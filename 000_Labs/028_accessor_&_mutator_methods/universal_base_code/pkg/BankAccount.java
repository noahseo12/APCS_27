/*
 *	Author:  Noah Seo
 *  Date: 10/27/26
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
	public BankAccount(){
		Owner ="Unknown";
		isActive =true;
		balance = 0.0;
		AccountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
		
	}
	public BankAccount(String o){
		Owner = o;
		isActive = true;
		balance = 0.0;
		AccountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
		
	}
	public BankAccount(String O, double b){
		Owner = O;
		isActive = true;
		balance = b;
		AccountNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
		
	}

		// -------METHODS-------
	public void checkBalance(){
		System.out.println(balance);
	}
	public void displayAccountInfo(){
		System.out.println("Owner: "+Owner);
		System.out.println("This account is active: "+isActive);
		System.out.println("Account number: "+AccountNumber);

	}
	public String getOwner(){
		return Owner;
	}
	public void setOwner(String o){
		Owner = o;
	}
	public double getBalance(){
		return balance;
	}
	public void closeAccount(){
		isActive = false;
	}
	public boolean isActive(){
		return true;
	}
	public double deposit(double d){
		if(isActive){
			balance=d+balance;
			return balance;
		}
		return balance;
	}
	public double withdraw(double w){
		if(isActive){
			if(balance > 0.0){
				balance = balance-w;
				return balance;
			}
		}
		return balance;
	}
}