import java.util.Scanner;

abstract class Furniture
{
	String name;
	String color;
	
	
	public abstract void roll();
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the name?");
		name=sc.nextLine();
		System.out.println("What is color:");
		color=sc.nextLine();
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
	}
}

class Chair extends Furniture
{
	int noOfLegs;
	
	public void acceptDetails() {
		
		Scanner sc=new Scanner(System.in);
		super.acceptDetails();		
		System.out.println("No of legs?");
		noOfLegs=sc.nextInt();
	}
	
	public void display()
	{
		super.display();
		System.out.println("No of Legs:"+noOfLegs);
	}
	
	public void roll()
	{
		System.out.println("Chair rolls");
	}
}

class BookShelf extends Furniture
{
	int noOfShelves;
	
	public void roll()
	{
		
	}
	public void acceptDetails() {
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("No of shelves?");
		noOfShelves=sc.nextInt();
	}
	
	public void display()
	{
		super.display();
		System.out.println("No of shelves:"+noOfShelves);
	}
}


public class App {

	public static void main(String[] args) {
		Furniture f=null;
		f=new Chair();
		f.acceptDetails();
		f.display(); 		//chair is fantastic
		f.roll();
		System.out.println("Now, you want bookself");
		f=new BookShelf();
		f.acceptDetails();
		f.display(); 		//bookshelf is useful
	}

}
