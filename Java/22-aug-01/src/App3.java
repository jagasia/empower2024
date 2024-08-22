import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int rollno;
		String name;
		double salary;
		
		rollno=sc.nextInt();
		name=sc2.nextLine();
		salary=sc.nextDouble();
		
		System.out.println("Check the values you entered:");
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(salary);
		
		
	}

}
