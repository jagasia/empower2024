
public class Gate {

//	public synchronized void securityCheck() throws InterruptedException
//	{
//		System.out.println(Thread.currentThread().getName()+" entered the gate");
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(Thread.currentThread().getName()+": "+i);
//			Thread.sleep(1000);
//		}
//		System.out.println(Thread.currentThread().getName()+" exits the gate");
//	}
	
	public void securityCheck() throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" entered gate");
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+": "+i);
			Thread.sleep(800);
		}
		
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+" entering sync block now");
			for(int i=0;i<5;i++)
			{
				System.out.println("inside sync block:"+Thread.currentThread().getName()+": "+i);
				Thread.sleep(800);
			}	
			System.out.println(Thread.currentThread().getName()+" exited the sync block now");
		}
		
		
	}
}
