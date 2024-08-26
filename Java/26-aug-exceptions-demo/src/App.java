import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String detail=sc.nextLine();
//		1, Ramkumar, 01-Sep-2000
		String[] arr = detail.split(",");
		Integer id=Integer.valueOf(arr[0]);
		String name=arr[1];
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Date dob=sdf.parse(arr[2]);
		Employee emp=null;
		
		try {
			emp=new Employee(id, name, dob);
			System.out.println(emp);
		} catch (InvalidIdException | InvalidNameException | InvalidDobException e) {
			System.out.println(e.getMessage());
			System.out.println("Try again");
		}
		
	}

}
