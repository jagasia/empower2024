import java.util.Comparator;

public class EmployeeDobComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getDob().compareTo(o2.getDob());
	}

}
