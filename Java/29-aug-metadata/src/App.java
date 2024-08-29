import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		con.setAutoCommit(false);
		con.createStatement().executeUpdate("UPDATE jag_customer set PHONE='979687686' where id=1");
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you sure you want to update?(y/n)");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("y"))
			con.commit();
		else
			con.rollback();
		con.close();
	}

}
