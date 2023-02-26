package testpackage1;

public class MultiplicationTable 
{
	static void multiplication(int a)
	{
		for(int i=1;i<=10;i++)
		{
			//System.out.format("%d X %d = %d\n" ,a,i,a*i);
			System.out.println(a*i);

		}
	}
	
	
	static void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("#");
				
			}
			System.out.println();
		}
	}
	
	
	static int sumRec(int s)
	{
		if(s==1)
		{
			return 1;
		}
		return s  +  sumRec(s-1);
	}
	
	
	static void pattern2(int p)
	{
		for(int i=1;i<=p;i++)
		{
			for(int j=p;j>=i;j--)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	
	static void pattern3(int m)
	{
		for(int i=1;i<=m;i++)
		{
			for(int j=m-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("%");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		//multiplication(8);
		//pattern(9);
		//int n=sumRec(9);
		//System.out.println(n);
		//pattern2(10);
		pattern3(10);
		

	}
}
