import java.util.Scanner;

public class AppRegEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		input=input.toLowerCase();
		//first letter check
		String str=input.substring(0,1);
		
		char c =input.charAt(0);
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isDigit(c));
		
		String str1=c+"";
		
		boolean first=str.matches("[a-z]");
		
		//second alpha, number, _
		boolean second=input.matches("[0-9a-z_]+");
		
		if(!first)
			System.out.println("Error 1");
		if(!second)
			System.out.println("Error 2");
		
		if(first & second)
			System.out.println("No Error");
	}

}
