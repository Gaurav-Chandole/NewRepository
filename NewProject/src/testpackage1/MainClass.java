package testpackage1;

public class MainClass 
{
	public static void main(String[] args)
	{
		Constructor var=new Constructor();
		System.out.println(var.a+ " "+ var.b);
		
		Constructor var1=new Constructor(50);
		System.out.println(var1.a+ " "+ var1.b);


	}
}
