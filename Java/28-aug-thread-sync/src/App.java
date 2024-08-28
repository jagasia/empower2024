class MyThread extends Thread
{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
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

	public static void main(String[] args) throws InterruptedException {
		MyThread t0=new MyThread();
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		MyThread t4=new MyThread();
		
		t0.start();
		t1.start();
		t2.start();
		t1.join();	
		t3.start();
		t4.start();
		
		
		
		
	}

}
