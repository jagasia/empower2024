import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1
{
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(610);
		marks.add(120);
		marks.add(210);
		marks.add(101);
		marks.add(310);
		marks.add(18);
		marks.add(190);
		marks.add(1010);
		marks.add(111);
		marks.add(127);
		
		//how to sort a List?
		Collections.sort(marks);	//works only with List
		System.out.println(marks);
	}
}