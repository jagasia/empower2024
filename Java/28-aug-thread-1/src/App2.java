class Black implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Black");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class White implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("WHite");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class App2 {

	public static void main(String[] args) {
		Thread t1=new Thread(new Black());
		Thread t2=new Thread(new White());
		
		t1.start();
		t2.start();

	}

}
