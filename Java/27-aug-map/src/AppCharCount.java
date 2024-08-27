import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class AppCharCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Map<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<input.length();i++)
		{
			char c=input.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Entry<Character, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
	}

}
