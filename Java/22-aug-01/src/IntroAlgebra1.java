import java.util.Scanner;

public class IntroAlgebra1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int input1=sc.nextInt();
		System.out.println("Enter Value 2:");
		int input2=sc.nextInt();
		
		if(Math.abs(input1)<10 || Math.abs(input2)<10 || Math.abs(input1)>99 || Math.abs(input2)>99)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		
		boolean check1=input1<10;
		boolean check2=input2<10;
		
//		if(check1 ^ check2)
//		{
//			System.out.println("Correct");
//		}else
//		{
//			System.out.println("Incorrect");
//		}
		
		System.out.println((check1 ^ check2)?"Correct":"Incorrect");
	}

}
