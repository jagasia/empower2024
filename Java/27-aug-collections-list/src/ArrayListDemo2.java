import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2
{
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Aryan");
		names.add("Mohammed");
		names.add("Nitin");
		names.add("Raja");
		names.add("Suresh");
		names.add("Ankit");
		names.add("Hari");
		names.add("Pari");
		
		//how to sort a list?
		Collections.sort(names);
		System.out.println(names);
	}
}