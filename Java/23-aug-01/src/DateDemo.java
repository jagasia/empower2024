import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		String str="23/Aug/2024";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM/yyyy");
		Date dt=sdf.parse(str);
		sdf=new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(dt));
	}

}
