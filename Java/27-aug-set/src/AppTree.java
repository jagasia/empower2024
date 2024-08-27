import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class GouthamComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}

public class AppTree {

	public static void main(String[] args) {
		Set<Integer> tree=new TreeSet<>(new GouthamComparator());
		tree.add(5);
		tree.add(42);
		tree.add(33);
		tree.add(38);
		tree.add(500);
		tree.add(50);
		tree.add(403);
		tree.add(33);
		tree.add(42);
		
		System.out.println(tree);
	}

}
