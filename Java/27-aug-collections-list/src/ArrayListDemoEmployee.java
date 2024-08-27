import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemoEmployee {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees");
		int n = sc.nextInt();
		List<Employee> list=new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String detail = sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
			Employee emp=new Employee();
			emp.setId(Integer.valueOf(arr[0]));
			emp.setName(arr[1]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
			emp.setDob(sdf.parse(arr[2]));
			emp.setSalary(Double.valueOf(arr[3]));
			
			list.add(emp);
		}
		
		Collections.sort(list);
		
		for(Employee e:list)
		{
			System.out.println(e);
		}
	}
}