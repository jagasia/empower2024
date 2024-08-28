import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AppObjectOutputDemo {

	public static void main(String[] args) throws IOException {
		Employee emp=new Employee();
		emp.setId(56);
		emp.setName("Pyush");
		emp.setDepartment("AIDS");
		emp.setSalary(123456);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("likit.dat"));
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		
		System.out.println("write is done");
	}

}
