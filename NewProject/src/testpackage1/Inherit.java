package testpackage1;

public class Inherit 
{
	public static void main(String[] args)
	{
		Child tender=new Child();
		tender.m1();
		int c=tender.m2(20, 25);
		System.out.println(c);
		tender.add();
	}

}
