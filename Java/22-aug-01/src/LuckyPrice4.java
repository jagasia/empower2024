import java.util.Scanner;

public class LuckyPrice4 {

	private static boolean isPalindrome(int num)
	{
		int reverse=0;
		int original=num;
		String revStr="";
		while(num>0)
		{
			int lastDigit=num%10;
			revStr=revStr+lastDigit;
			num/=10;
		}
		reverse=Integer.parseInt(revStr);
		
		return original==reverse;
	}
	
	private static int digitSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			num/=10;
			sum+=digit;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		if(isPalindrome(input) && digitSum(input)%2==0)
		{
			System.out.println("Winner");
		}else
		{
			System.out.println("Not a winner");
		}
	}

}
