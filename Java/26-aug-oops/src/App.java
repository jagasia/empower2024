import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Shape s=null;		//what is s? s is a ref var 
		System.out.println("1: Triangle\r\n"
				+ "2: Rectangle\r\n"
				+ "3: Circle\r\n"
				+ "x: Exit");
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do
		{
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:		//triangle
				s=new Triangle();
				break;
			case 2:		//rectangle
				s=new Rectangle();
				break;
			case 3:		//circle
				s=new Circle();
				break;
			}
			s.calculateArea();
		}while(choice<=3 && choice>=1);
	}

}
