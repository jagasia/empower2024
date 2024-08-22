
public class App4 {

	public static void main(String[] args) {
		String str1=new String("hello");
		String str2=new String("HELLO");
//		str1.length();
		
		System.out.println(str1.equalsIgnoreCase(str2));
		char[] arr = str1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
