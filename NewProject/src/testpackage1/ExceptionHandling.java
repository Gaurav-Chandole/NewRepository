package testpackage1;

public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		int a=10;
		String s=null;
		try {
		System.out.println("1");
		System.out.println(a/0);
		System.out.println("2");
		System.out.println(s.length());
		System.out.println("3");
		}
		catch (ArithmeticException ae) {
			System.out.println("Arithmatic Catch");
		}
		catch(Exception e)
		{
			System.out.println("Catch");
		}
		
		finally {
			System.out.println("Finally");
		}
	}
}
