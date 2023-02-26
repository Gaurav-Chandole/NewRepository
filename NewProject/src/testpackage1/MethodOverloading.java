package testpackage1;

public class MethodOverloading 
{
	static void m1()
	{
		System.out.println("It,s Method1 without arguments");
	}
	static void m1(int a)
	{
		System.out.println("It,s Method1 with arguments");

	}
	void m1(int a,float b)
	{
		System.out.println("It,s Method1 with float arguments");

	}
	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		mo.m1(13,15);
		m1();
		m1(18);
	}

}
