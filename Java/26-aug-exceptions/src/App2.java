import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			String input=sc.next();
			System.out.println(input);
		}
	}

}
