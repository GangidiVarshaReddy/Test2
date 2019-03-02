package test;

import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeDetails {
	
	String custName;
	long mobileNo;
	int age;
	ArrayList customer=new ArrayList();
	

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void details() throws AgeDoesNotMatches {
		Scanner scanner=new Scanner(System.in);
		customer.add(scanner.next());
      
		if(age>20&&age<55) {
			System.out.println("age matches");
		}
			else
				throw new AgeDoesNotMatches("age does not matches");
		
		
	}
public static void main(String args[]) throws AgeDoesNotMatches {
		EmployeeDetails object=new EmployeeDetails();
		object.details();
	}
class AgeDoesNotMatches extends Exception{

	public AgeDoesNotMatches(String string) {
		super();
	}
	
}

}
