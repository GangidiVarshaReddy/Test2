package test;

import java.util.Scanner;

public class FixedAccount {
	float amount,interest;
	int rate,time;
	public void calculateInterest(){
		Scanner sc=new Scanner(System.in);
		amount=sc.nextFloat();
		rate=sc.nextInt();
		time=sc.nextInt();
		interest=(amount*rate*time)/100;
		System.out.println("interest on fixed amount"+interest);
	}
	public class Savings extends FixedAccount{
		
	}
	
public static void main(String args[]) {
	FixedAccount object=new FixedAccount();
	object.calculateInterest();
}
}
