class Passenger extends Thread
{
	Gate g;
	public Passenger(Gate g)
	{
		this.g=g;
	}
	public void run()
	{
		try {
			g.securityCheck();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class App2 {

	public static void main(String[] args) {
		Gate g=new Gate();
		Passenger t1=new Passenger(g);
		Passenger t2=new Passenger(g);
		
		t1.setName("Hari");
		t2.setName("Ahmed");
		t1.start();
		t2.start();
		
	}

}
