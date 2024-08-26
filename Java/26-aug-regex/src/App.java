import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String input=new Scanner(System.in).next();
		//String class provides "matches" method 
		
		System.out.println(input.matches("E\\d{3}"));
	}

}
