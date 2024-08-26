import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExtract {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		Pattern p = Pattern.compile("[A-Za-z]+([.][A-Za-z0-9]+)?@[A-Za-z]+[.]([A-Za-z]{2,3}|[A-Za-z]{2}[.][A-Za-z]{2})");
		Matcher matcher = p.matcher(input);
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}		
	}

}
