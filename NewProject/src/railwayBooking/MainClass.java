package railwayBooking;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args)
	{
		System.out.println("****Welcome To Railway Booking System****");
		System.out.println(" **We are Happy To Help You**   ");
		System.out.println("__Please Enter your Choice for Reservation you Want___");
		System.out.println("<1>Genral");
		System.out.println("<2>First Class");
		System.out.println("<3>Second Class");
		System.out.println("<4>Sleeper");
		System.out.println("<5>Sleeper With AC");
		Scanner s=new Scanner(System.in);
		Genral ge=new Genral();
		int a=s.nextInt();
		if(a==0){
			System.out.println("Sorry We Have No Any Choice For this");
				}
		else
		{
		switch(a)
		{
		case 1:
			System.out.println("You want's Genral Reservation");
			System.out.println("How many Tickets you wants From Genral Reservation:");
			int g=s.nextInt();
			ge.genral(g);
			break;
		case 2:
			System.out.println("You want's FirstClass Reservation");
			System.out.println("How many Tickets you wants From FirstClass Reservation:");
			int f=s.nextInt();
			ge.firstclass(f);
			break;
		case 3:
			System.out.println("You want's SecondClass Reservation");
			System.out.println("How many Tickets you wants From SecondClass Reservation:");
			int n=s.nextInt();
			ge.secondclass(n);
			break;
		case 4:
			System.out.println("You want's Sleeper Reservation");
			System.out.println("How many Tickets you wants From Sleeper Reservation:");
			int m=s.nextInt();
			ge.sleeper(m);
			break;
		case 5:
			System.out.println("You want's Sleeper With AC Reservation");
			System.out.println("How many Tickets you wants From Sleeper with AC Reservation:");
			int c=s.nextInt();
			ge.sleepac(c);
			break;
		}
		}
		
	}
}
