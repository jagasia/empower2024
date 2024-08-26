import java.util.Scanner;

public class EmailDemo {

	public static void main(String[] args) {
		String input=new Scanner(System.in).next();
		String pattern="[A-Za-z]+([.][A-Za-z0-9]+)?@[A-Za-z]+[.]([A-Za-z]{2,3}|[A-Za-z]{2}[.][A-Za-z]{2})";
		System.out.println((input.matches(pattern))?"Valid email":"Invalid email");
	}

}
