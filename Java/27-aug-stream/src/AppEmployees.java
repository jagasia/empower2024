import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AppEmployees {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(8, "Raja", "ECE", 100000));
		empList.add(new Employee(4, "Ankit", "AIML", 100000));
		empList.add(new Employee(7, "Zaheer", "AIML", 100000));
		empList.add(new Employee(9, "Sachin", "AIDS", 100000));
		empList.add(new Employee(1, "Vishnu", "AIDS", 100000));
		empList.add(new Employee(5, "Dravid", "AIML", 100000));
		empList.add(new Employee(6, "Bumrah", "CSE", 100000));
		empList.add(new Employee(3, "Chahal", "ECE", 100000));
		empList.add(new Employee(10, "Siraj", "ECE", 100000));
		empList.add(new Employee(2, "Kohli", "CSE", 100000));
		
//		empList.stream()
//		.filter((t)->t.getDepartment().equals("ECE"))
//		.sorted((a,b)->a.getName().compareTo(b.getName()))
//		.map((e)->e.getName().length())
//		.forEach(System.out::println);

		Map<String, Integer> result = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingInt(Employee::getSalary)));;
	
		for(Entry<String, Integer> e:result.entrySet())
			System.out.println(e.getKey()+"\t"+e.getValue());
	
	}

}
