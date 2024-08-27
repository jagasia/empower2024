import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Integer arr[]= {19,92,39,94,59,16,71,18};
//		Arrays.sort(arr,(a,b)->{ return b-a; });
		
//		Arrays.sort(arr,(a,b)->b.compareTo(a));
		
		Arrays.sort(arr,(a,b)->b-a);
		
		
		System.out.println(Arrays.toString(arr));
	}

}
