import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		switch(input)
		{
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("OK");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

}
