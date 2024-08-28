import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AppObjectInputDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("likit.dat"));
		Employee emp= (Employee) ois.readObject();
		
		System.out.println(emp);
	}

}
