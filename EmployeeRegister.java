package MiniProjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeRegister {
	String FirstName="";
	String LastName="";
	long MobileNumber=0;
	String EmailId="";
	String Address="";
	public  EmployeeRegister(String s,String s2,long s3,String s4,String s5){
		FirstName=s;
		LastName=s2;
		MobileNumber=s3;
		EmailId=s4;
		Address=s5;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the employees to add");
	int re=sc.nextInt();
	ArrayList<EmployeeRegister> arr=new ArrayList<>();
	for(int i=0;i<re;i++) {
		System.out.println("Enter the Firstname");
		String s=sc.next();
		System.out.println("Enter the Lastname");
		String s1=sc.next();
		System.out.println("Enter the MobileNumber");
		long s2=sc.nextLong();
		System.out.println("Enter the EmailId");
		String s3=sc.next();
		System.out.println("Enter the Address");
		String s4=sc.next();
		arr.add(new EmployeeRegister(s,s1,s2,s3,s4));
	}
	Iterator<EmployeeRegister> it=arr.iterator();
	System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","MobileNumber","EmailId","Address");
	System.out.println("------------------------------------------------------------------------------------------");
	while(it.hasNext()) {
		EmployeeRegister e=it.next();
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n",e.FirstName,e.LastName,e.MobileNumber,e.EmailId,e.Address);
	}
}
}
