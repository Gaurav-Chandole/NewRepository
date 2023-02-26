package testpackage1;

public class RevarseArray 
{
	public static void main(String [] args)
	{
		int a[]= {15,17,20,35};
		int rev;
		System.out.println("Length of Array is:"+a.length);
		rev=a.length-1;
		for(int b=rev;b>=0;b--)
		{
			System.out.println(a[b]);
		}
	}
}
