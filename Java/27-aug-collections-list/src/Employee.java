import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>
{
	private Integer id;
	private String name;
	private Date dob;
	private Double salary;
	
	public Employee() {}

	public Employee(Integer id, String name, Date dob, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		return "Employee [id=" + id + ", name=" + name + ", dob=" + sdf.format(dob) + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
//		return this.getId()-o.getId();
		return o.getId().compareTo(this.getId());
//		return this.getName().compareTo(o.getName());
//		return this.getDob().compareTo(o.getDob());
//		return this.getSalary().compareTo(o.getSalary());
//		if(this.getDob().equals(o.getDob()))
//			return this.getName().compareTo(o.getName());
//		else
//			return this.getDob().compareTo(o.getDob());
	}
	
}
