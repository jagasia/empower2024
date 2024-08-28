import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppData {

	public static void main(String[] args) throws IOException {
		//input from the file as primitive type
		FileOutputStream fos=new FileOutputStream("guru.dat");
		int id=20;
		float f=1.2f;
		long l=5l;
		char c='a';
		
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(id);
		dos.writeFloat(f);
		dos.writeLong(l);
		dos.writeChar(c);
		
		dos.flush();
		dos.close();
		System.out.println("Write is done");
	}

}
