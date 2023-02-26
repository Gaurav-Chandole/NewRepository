package railwayBooking;

public class Genral implements AbstractGST 
{
	int total;
	@Override
	public void genral(int a) {
		// TODO Auto-generated method stub
		this.total=(100+gst)*a;
		System.out.println("Ticket Of Genral Reservation is 100Rs");
		System.out.println(" And You Have "+gst+"rs GST for per person");
		System.out.println("<<<< So Your Total Tickets of " +a+" Person is "+total+"rs >>>>");
		System.out.println("******__Thank You Visit Again__******");
		
	}

	@Override
	public void firstclass(int b) {
		// TODO Auto-generated method stub
		this.total=(150+fgst)*b;
		System.out.println("Ticket Of FirstClass Reservation is 150Rs");
		System.out.println(" And You Have "+fgst+"rs GST for per person");
		System.out.println("<<<< So Your Total Tickets of " +b+" Person is "+total+"rs >>>>");
		System.out.println("******__Thank You Visit Again__******");
	}

	@Override
	public void secondclass(int c) {
		// TODO Auto-generated method stub
		this.total=(180+sgst)*c;
		System.out.println("Ticket Of SecondClass Reservation is 180Rs");
		System.out.println(" And You Have "+sgst+"rs GST for per person");
		System.out.println("<<<< So Your Total Tickets of " +c+" Person is "+total+"rs >>>>");
		System.out.println("******__Thank You Visit Again__******");
	}

	@Override
	public void sleeper(int d) {
		// TODO Auto-generated method stub
		this.total=(200+slgst)*d;
		System.out.println("Ticket Of Sleeper Reservation is 200Rs");
		System.out.println(" And You Have "+slgst+"rs GST for per person");
		System.out.println("<<<< So Your Total Tickets of " +d+" Person is "+total+"rs >>>>");
		System.out.println("******__Thank You Visit Again__******");
	}

	@Override
	public void sleepac(int e) {
		// TODO Auto-generated method stub
		this.total=(230+sagst)*e;
		System.out.println("Ticket Of Sleeper with AC Reservation is 230Rs");
		System.out.println(" And You Have "+sagst+"rs GST for per person");
		System.out.println("<<<< So Your Total Tickets of " +e+" Person is "+total+"rs >>>>");
		System.out.println("******__Thank You Visit Again__******");
	}

}
