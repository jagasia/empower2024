import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AppCollegeHashSet {

	public static void main(String[] args) throws ParseException {
		Set<College> collegeSet=new HashSet<>();
//		String name, String website, String mobile, String founder, String location, Integer numberOfDept,
//				Date startingDate
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		collegeSet.add(new College("SIT", "sit.com", "79797979", "SGS", "Tumkur",2, sdf.parse("01-01-1969")));
		collegeSet.add(new College("SIT", "bms.com", "19191919", "BMS", "Basawangudi",5, new Date()));
		collegeSet.add(new College("BMS", "bms.com", "19191919", "BMS", "Basawangudi",5, sdf.parse("01-01-1946")));
		collegeSet.add(new College("BMS", "bms.com", "19191919", "BMS", "Basawangudi",5, new Date()));
		
		for(College c:collegeSet)
			System.out.println(c);
	}

}
