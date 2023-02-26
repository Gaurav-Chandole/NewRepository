package testpackage1;

public class Method1 {
	public static void main(String[] args)
	{
		Method1 m1= new Method1();
		int c=m1.addition(20,50);
		int s=m1.sub(100,40);
		System.out.println(c);
		System.out.println(s);
		System.out.println("It's work");
	}
	int addition(int a, int b)
	{
		int c=a+b;
		//System.out.println(c);
		return c;
	}
	int sub(int a,int b)
	{
		int c;
		c=a-b;
		//System.out.println(c);
		return c;
	}

}
