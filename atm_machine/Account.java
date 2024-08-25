package atm_machine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input =  new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	/* Set Customer Number*/
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	/* get Customer Number*/
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	/* Set Pin Number*/
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	/* Get Pin Number*/
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	/* Get Checking Account */
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	/* Get Saving Account */
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/* Calculate the Checking Amount Withdraw */
	
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	

	/* Calculate the Saving Amount Withdraw */
	
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	/* Calculate Checking account deposite */
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	/* Calculate Saving account deposite */
	
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	/* Customer Checking Account Withdraw Input */
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Amount Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	/* Customer Saving Account Withdraw Input */
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Amount Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	/* Customer Checking Account Deposite Input */
	
	public void getCheckingDepositInput() {
	System.out.println("Checking Amount Balance: " + moneyFormat.format(checkingBalance));
	System.out.println("Amount you want to deposit from Checking Account: ");
	double amount = input.nextDouble();
	
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	/* Customer Saving Account Deposit Input */
	
	public void getSavingDepositInput() {
		System.out.println("Saving Amount Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from Saving Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance Cannot be Negative." + "\n");
		}
	}
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance =0;
	private double savingBalance = 0;
}
