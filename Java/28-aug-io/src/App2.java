import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {

	public static void main(String[] args) throws IOException {
		//read chars from keyboard
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		BufferedInputStream bis=new BufferedInputStream(System.in);
//		char c=(char) br.read();
//		System.out.println("Your input is "+c);
		
		String input = br.readLine();
		System.out.println(input);
	}

}
