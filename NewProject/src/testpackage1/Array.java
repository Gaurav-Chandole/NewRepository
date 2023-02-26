package testpackage1;

public class Array 
{
	public static void main(String[] args)
	{
		//int a=40;
		//change(a);
		//System.out.println(a);
		//Case1: Changing the Integer
		
		int [] marks= {56,78,76,77,45};
		change1(marks);
		System.out.println("Changing of Array Value is:"+ marks[1]);
		
	}
	
	static void change(int a)
	{
		a=50;
	}
	
	static void change1(int []a)
	{
		a[1]=95;
	}

}
