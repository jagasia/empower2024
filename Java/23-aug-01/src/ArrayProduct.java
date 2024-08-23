import java.util.Arrays;
import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		
		//iterate each element of the array
		int product=1;
		for(int x:arr)
		{
			if(x>9 && x<100)
			{
				product*=x;
			}
		}
		
		System.out.println("...............");
		System.out.println(product);
	}

}
