import java.util.Scanner;

public class Dice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		
		if(no1<0 || no2<0 || no1>6 || no2>6)
		{
			System.out.println("Invalid Input");
			System.exit(0); 	//stop execution
		}
		
		int result=no1+no2;
		if(no1==no2)
		{
			result*=2;
		}
		System.out.println("The points scored is "+result);
	}

}
