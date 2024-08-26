import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MagicPrime {

	public static boolean isPrime(int num)
	{
		if(num<2)
			return false;
		if(num==2)
		{
			return true;
		}
		for(int denom=2;denom<=Math.sqrt(num);denom++)
		{
			if(num%denom==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static int[] primes(int from, int to)
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=from;i<=to;i++)
		{
			if(isPrime(i))
			{
				list.add(i);
			}
		}
		int[] arr= new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] = list.get(i);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int from=sc.nextInt();
		int to=sc.nextInt();
		
		int[] result = primes(from, to);
		
		System.out.println(Arrays.toString(result));
	}

}
