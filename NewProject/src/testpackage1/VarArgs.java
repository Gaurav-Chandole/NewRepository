package testpackage1;

public class VarArgs 
{
	static int sum(int ...arr)
	{
		int result=0;
		for(int a: arr)
		{
			result+=a;
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println("Sum of two no 4 and 5 is:"+sum(4,5));
		System.out.println("Sum of three no 4,5 and 10 is:"+sum(4,5,10));

		
	}
}
