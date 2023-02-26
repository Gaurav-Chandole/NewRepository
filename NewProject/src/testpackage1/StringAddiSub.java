package testpackage1;

public class StringAddiSub 
{
	public static void main(String[] args)
	{
		String s1="Gaurav";
		String s2="Java";
		String s3="This is my World";
		System.out.println(s1+s2);
		System.out.println(s1+10);
		System.out.println(s1+s2+20/1030);
		System.out.println(s2.concat(s1));
		System.out.println(String.join(":", s1,s2,s1));
		System.out.println(s3.subSequence(3, 10));
		System.out.println(s3.substring(3));
		System.out.println(s3.substring(3, 16));
	}

}
