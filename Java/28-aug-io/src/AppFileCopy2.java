import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppFileCopy2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f1=new File("C:\\Users\\rjaga\\Pictures\\paratta.jpg");
		File f2=new File("gowtam.jpg");
		
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos=new FileOutputStream(f2);
		
		int data=-1;
		
		while((data=fis.read())!=-1)
		{
			fos.write(data);
			fos.flush();	
			Thread.sleep(10);
		}
		System.out.println("Done.....");
		
	}

}
