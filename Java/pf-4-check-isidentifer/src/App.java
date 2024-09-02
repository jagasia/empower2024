import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		input=input.toLowerCase();

		boolean error1=false;
		boolean error2=false;
		char first=input.charAt(0);
		if(first<'a' || first>'z')
		{
			error1=true;
			System.out.println("Error 1");	
		}
		
		for(int i=1;i<input.length();i++)
		{
			//either alphabet or number or _
			//alpha check
			char c=input.charAt(i);
			if(c>='a' && c<='z')
			{
				//an alphabet
				continue;
			}else if(c>='0' && c<='9')
			{
				//a number
				continue;
			}else if(c=='_')
			{
				//underscore
				continue;
			}else
			{
				System.out.println("Error 2");
				System.exit(0);
			}			
			
		}
		if(!error1)
			System.out.println("No Error");
	}

}
