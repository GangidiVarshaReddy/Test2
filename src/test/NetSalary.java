package test;

import java.util.Scanner;

public class NetSalary {
	float basicSal,hra,splAllowance,pfDeduction,totalSal;
	
	
	public void totalsal() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary");
		basicSal=sc.nextFloat();
		
		hra=((50/100)*basicSal);
	
		splAllowance=((75/100)*basicSal);
		
		pfDeduction=((12/100)*basicSal);
	     
		totalSal=basicSal+hra+splAllowance+pfDeduction;
		System.out.println("totalSal"+totalSal);
	}
	
	
public static void main(String args[]) {
	NetSalary salary=new NetSalary();
	salary.totalsal();
}
}
