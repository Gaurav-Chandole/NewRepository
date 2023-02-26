package testpackage1;

public class StacMethod 
{
	int a=10;
	static int b=20;
	private static StacMethod staticmethodcalling;
	public static void main(String[] args)
	{
		staticmethodcalling.addition();
		staticmethodcalling.addition1();
		double d=staticmethodcalling.addition2(400,600);
		System.out.println(d);
		System.out.println(staticmethodcalling.addition2(400,600));

		
		
		
	}
	static void addition()
	{
		int m=10;
		b=20;
		int c=m+b;
		System.out.println(c);
	}
	static void addition1()
	{
		double d=100;
		double e=200;
		double a=d+e;
		System.out.println(a);
	}
	static double addition2(double a ,double b)
	{
		double c;
		c=a+b;
		return c;
	}
	

}
