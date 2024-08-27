

interface Person
{
	void speak();
}

class Employee
{
	public void talk()
	{
		System.out.println("Employee talks");
	}
	
	public static void read()
	{
		System.out.println("Employee reads it louder");
	}
}

public class App {

	public static void main(String[] args) {		
		Employee emp=new Employee();
//		Person raja=emp::talk;
		Person raja=Employee::read;

		raja.speak();
	}

}
