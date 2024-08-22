
public class Employee {
	int id;
	String name;
	double salary;
	
	public static void main(String[] args) {
		Employee raja=new Employee();
		Employee suresh=raja;	
		int x=20;
		
		Employee jag;	//jag is a reference variable (not object)
		jag=new Employee();
		
		new Employee();
		
	}
}
