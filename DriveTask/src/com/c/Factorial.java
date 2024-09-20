package com.c;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Factor" + ":"+i);
			}
		}
		
	}
}
