package testpackage1;

import java.util.Scanner;

public class Revarse
{
	static void revarse(String a)
	{
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("Your revarse String is:"+rev);
	}
	static void palindrom(String a)
	{
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		//System.out.println("Your revarse String is:"+rev);
		if(a.equalsIgnoreCase(rev))
		{
			System.out.println("It's a Plindrom");
		}
		else
		{
			System.out.println("It's not a Plindrom");
		}
	}
	static void maxNumber(String a)
	{
		int [] arr=new int[127];
		for(int i=0;i<=a.length()-1;i++)
		{
			arr[a.charAt(i)]=arr[a.charAt(i)]+1;
		}
		int max=-1;
		char c=' ';
		for(int i=0;i<a.length();i++)
		{
			if(max<arr[a.charAt(i)])
			{
				max=arr[a.charAt(i)];
				c=a.charAt(i);
			}
		}
		System.out.println("Maximum Repated Charcter is:"+c);
	}
	public static void main(String[] args)
	{
		String a;
		System.out.println("Please Enter your String");
		Scanner s=new Scanner(System.in);
		a=s.next();
		System.out.println("Your Given String is:"+a);
		revarse(a);
		palindrom(a);
		maxNumber(a);
		
	}

}
