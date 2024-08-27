import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AppMainComparatorDemo {

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
		int choice=0;
		do
		{
			System.out.println("1: Sort by Id\r\n"
					+ "2: Sort by Name\r\n"
					+ "3: Sort by Dob\r\n"
					+ "4: Sort by Salary\r\n"
					+ "5: Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:			//by id
				Collections.sort(list);
				break;
			case 2:			//by name
				Collections.sort(list, new EmployeeNameComparator());
				break;
			case 3:			//dob
				Collections.sort(list, new EmployeeDobComparator());
				break;
			case 4:			//salary
				Collections.sort(list, new EmployeeSalaryComparator());
				break;
			}
			//display the employees in selected order
			for(Employee e:list)
				System.out.println(e);
		}while(choice<5);
	}

}
