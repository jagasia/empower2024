
class Employee
{
	int id;
	String name;
	static String companyName;
	static final String LOCATION="Bengaluru";
	
	
	public void setId(int id)	
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	
	void work()
	{
		final int i=20;
		System.out.println(name+" works");
	}
	
	static void followRules()
	{
//		id=100;
		companyName="Great West Global";
		System.out.println("Employee follows the rules");
	}
}

public class App {
	static {
		System.out.println("Static block is executed now....");
	}

	public static void main(String[] args) {
		System.out.println("first line of main method");
		Employee gagan=new Employee();
		Employee nitin=new Employee();
		
		gagan.id=1;
		gagan.name="Gagan";
		gagan.companyName="Empower";
		
		System.out.println(nitin.id);
		System.out.println(nitin.name);
		System.out.println(nitin.companyName);

		gagan.work();
//		Employee.work();
		Employee.followRules();
	}

}
