import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<Integer> marks=new HashSet<>();
		marks.add(8);
		marks.add(6);
		marks.add(11);	
		marks.add(21);
		marks.add(9);
		marks.add(3);
		marks.add(12);	//rejected
		marks.add(11);	//rejected
		marks.add(4);
		
		System.out.println(marks);
	}

}
