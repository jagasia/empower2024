import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppFileCopy {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\rjaga\\Pictures\\pizza1.jfif");
		long len = f.length();
		byte []data=new byte[(int) len];
		FileInputStream fis=new FileInputStream(f);
		fis.read(data);
		fis.close();
		
		//write all the bytes to a new file
		File f1=new File("guru.jfif");
		FileOutputStream fos=new FileOutputStream(f1);
		fos.write(data);
		fos.flush();
		fos.close();
	}

}
