package com.a;

import java.util.Scanner;

public class Bank {

	public void deposite(int amount)
	{
		if(amount<=0)
		{
			throw new AmountException("Negative Amount or 0 amount not Consider..");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount=sc.nextInt();
		Bank b=new Bank();
		b.deposite(amount);
	}
}
