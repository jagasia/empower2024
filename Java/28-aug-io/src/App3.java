import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class App3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("nitin.txt"));
		String input = br.readLine();
		System.out.println(input);
	}

}
