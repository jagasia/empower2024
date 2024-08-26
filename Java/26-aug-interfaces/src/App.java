interface Person
{
	int AGE=20;
	String COMPANY_NAME="Empower";
	void speak();
}

class Employee implements Person
{
	public void speak()
	{
		System.out.println("Employee speak");
	}
}

interface Student	//1.8 onwards
{
	public default void listen()
	{
		System.out.println("Student listens");
	}
	
	static void walk()
	{
		System.out.println("Student walks");
	}
	
}

class JavaStudent implements Student
{
	public void listen()
	{
		System.out.println("Java student listens");
	}
	public static void walk()
	{
		System.out.println("java student walks");
	}
}
public class App {

	public static void main(String[] args) {
//		Person raja;
//		raja=new Person();		//error
		JavaStudent jag=new JavaStudent();
		jag.listen();
		Student.walk();
		JavaStudent.walk();
	}

}
