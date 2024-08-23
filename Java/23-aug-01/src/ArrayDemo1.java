import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for x:");
		int x=sc.nextInt();
		System.out.println("Enter value for y:");
		int y=sc.nextInt();
		arr=new int[x][y];
		
		//get input for array elements
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("arr[%d][%d]",i,j);
				arr[i][j]=sc.nextInt();
			}
		}
		//lets display the array
		System.out.println();
		System.out.println("Displaying the array values now:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[1].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
