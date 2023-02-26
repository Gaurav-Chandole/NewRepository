package testpackage1;

public class ReplaceString 
{
	public static void main(String[] args)
	{
		String s1="This is Demo";
		System.out.println(s1.replace("is", "was"));
		System.out.println(s1.replaceFirst("is(.*)","was"));

	}
}