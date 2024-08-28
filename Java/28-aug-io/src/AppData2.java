import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class AppData2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("guru.dat");
		DataInputStream dis=new DataInputStream(fis);
		
		int i=dis.readInt();
		float f=dis.readFloat();
		long l=dis.readLong();
		char c=dis.readChar();
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(l);
		System.out.println(c);
		
	}

}
