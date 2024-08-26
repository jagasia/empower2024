import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		Bank sbi=new Bank();
		try {
			sbi.withdraw(100001);
		} catch (IOException e) {
			System.out.println("Amount exceeds day limit");
		}
		System.out.println("Program continues");
	}

}
