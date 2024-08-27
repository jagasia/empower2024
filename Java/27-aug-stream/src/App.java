import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class MyPredicate implements Predicate<String>
//{
//
//	@Override
//	public boolean test(String t) {
//		// TODO Auto-generated method stub
//		return t.length()<6;
//	}
//	
//}

public class App {

	public static void main(String[] args) {
		List<String> countries=new ArrayList<>();
		countries.add("North Korea");
		countries.add("Russia");
		countries.add("China");
		countries.add("Pakistan");
		countries.add("Bangladesh");
		countries.add("Sri lanka");
		countries.add("India");
		countries.add("Afghanisthan");
		countries.add("Japan");
		countries.add("Germany");
		
//		Stream<String> s = countries.stream();
//		Stream<String> another = s.filter((t)->t.length()<6);
//		Stream<String> onemorestream = another.sorted();
		
//		countries.stream()
//		.filter((t)->t.length()<6)
//		.sorted((a,b)->b.compareTo(a))
//		.forEach(System.out::println);		//terminal operation
//		
		Set<String> result = countries.stream()
		.collect(Collectors.toSet()); 		//terminal operation
		
		System.out.println(result);
//		countries.forEach(System.out::println);
	}

}
