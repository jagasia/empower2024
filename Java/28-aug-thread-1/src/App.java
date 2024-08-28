class Odd extends Thread
{
	public void run()
	{
		for(int i=1;i<30;i+=2)
		{
			System.out.println(Thread.currentThread().getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Even extends Thread
{
	public void run()
	{
		for(int i=2;i<30;i+=2)
		{
			System.out.println(getName()+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class App {

	public static void main(String[] args) {
		Odd o=new Odd();
		o.setName("Odd thread");
		Even e=new Even();
		e.setName("Even thread");
		
		o.start();
		e.start();
		

	}

}
