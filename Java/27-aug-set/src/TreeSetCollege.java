import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollege {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Set<College> collegeSet=new TreeSet<>((a,b)->a.getLocation().compareTo(b.getLocation()));
		collegeSet.add(new College("SIT", "sit.com", "79797979", "SGS", "Tumkur",2, sdf.parse("01-01-1969")));
		collegeSet.add(new College("BNM", "bms.com", "19191919", "BMS", "Banasankari",5, new Date()));
		collegeSet.add(new College("Amrita", "bms.com", "19191919", "BMS", "Sarjapura",5, sdf.parse("01-01-1946")));
		collegeSet.add(new College("BMS", "bms.com", "19191919", "BMS", "Basawangudi",5, new Date()));

		for(College c:collegeSet)
			System.out.println(c);
	}

}
