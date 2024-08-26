import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private Integer id;
	private String name;
	private Date dob;
	
	public Employee() {}

	public Employee(Integer id, String name, Date dob) throws InvalidIdException, InvalidNameException, InvalidDobException {
		super();
		setId(id);
		setName(name);
		setDob(dob);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) throws InvalidIdException {
//		id must be 6 digit number
//		if not, InvalidIdException
//		mention the invalid value also in the message.
//		String str=id+"";
		String str=String.valueOf(id);
		if(str.length()==6)
		{
			this.id=id;
		}else
		{
			throw new InvalidIdException("The id "+id+" is invalid");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidNameException {
//		name must begin with upper case and followed by lower case
//		minimum 4 characters
		String pattern="[A-Z][a-z]{3}";
		name=name.trim();
		if(name.matches(pattern))
		{
			this.name=name;
		}else
		{
			throw new InvalidNameException("The name"+name+" is invalid");
		}
		
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) throws InvalidDobException {
		Date today=new Date();
//		dob.compareTo(today);		returns -1 or 0 or 1
//		dob.before(today);			true or false
		if(today.compareTo(dob)>0)
		{
			this.dob=dob;
		}else
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
			throw new InvalidDobException("The date "+ sdf.format(dob) +" is invalid");
		}
		
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		return "Employee [id=" + id + ", name=" + name + ", dob=" + sdf.format(dob) + "]";
	}
	
	
}
