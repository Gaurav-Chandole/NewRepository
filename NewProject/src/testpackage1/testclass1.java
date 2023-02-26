package testpackage1;
import java.util.Scanner;


public class testclass1 
{
	public static void main(String[] args)
	{
		System.out.println("It is a Student Profile");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Student");
		String n=sc.nextLine();
		System.out.println("Enter the Roll Number of Student");
		int a=sc.nextInt();
		System.out.println("Enter the Mobile No of Student");
		long m=sc.nextLong();
		//System.out.println("Enter the Address Of Student");
		//String add=sc.nextLine();
		System.out.println("Enter the Percentage of Student");
		float p=sc.nextFloat();
		System.out.println("Your Enter the Name of Student is "+n);
		System.out.println("Your Enter roll of Student is "+a);
		//System.out.println("Your Enter address of Student is "+add);
		System.out.println("Your Enter mobile of Student is "+m);
		System.out.println("Your Enter percentage of Student is "+p);
		
	}
}
