import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream("nitin.txt");
		
		Scanner sc=new Scanner(fis);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		
	}

}
