import java.util.LinkedHashSet;
import java.util.Set;

public class AppChallenge {

	public static int[] removeDuplicates(int []input)
	{
		int result[]=null;
		//write your code here
		Set<Integer> set=new LinkedHashSet<>();
		for(int x:input)
		{
			set.add(x);
		}
		result=new int[set.size()];
		int index=0;
		for(int x: set)
		{
			result[index++]=x;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[]= {88, 11, 88, 20, 19, 88, 20, 50};
		//output we expect is 
		//88, 11, 20, 19, 50
		int[] result = removeDuplicates(arr);
		for(int x: result)
		{
			System.out.println(x);
		}
	}

}
