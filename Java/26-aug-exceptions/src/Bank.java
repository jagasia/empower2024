import java.io.IOException;

public class Bank {
	public void withdraw(int amount) throws IOException	{	
		if(amount>100000)
		{
			throw new IOException();
		}else
		{
			System.out.println("Remember to collect cash");
		}
	}
}
