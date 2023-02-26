package testpackage1;

public class StaticNonstatic 
{
	int a=10;
	int b=20;
	static int c=30;
	
	StaticNonstatic()
	{
		++a;
		++b;
		++c;
	}
	StaticNonstatic(int a)
	{
		this.a=++a;
		++b;
		++c;
	}
	StaticNonstatic(int a,int b)
	{
		this.a=++a;
		this.b=++b;
		++c;
	}
	
	public static void main(String[] args)
	{
		StaticNonstatic con=new StaticNonstatic();
		System.out.println(con.a);
		System.out.println(con.b);
		System.out.println(con.c);
		
		StaticNonstatic con1=new StaticNonstatic(10);
		System.out.println(con1.a);
		System.out.println(con1.b);
		System.out.println(con1.c);
		
		StaticNonstatic con2=new StaticNonstatic(10,20);
		System.out.println(con2.a);
		System.out.println(con2.b);
		System.out.println(con2.c);


	}
	

}
