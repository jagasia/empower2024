import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		String password=sc.nextLine();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement st = con.createStatement();
		String sql="select * from user_master where username='"+username+"' and password='"+password+"'";
		ResultSet rs = st.executeQuery(sql);
		if(rs.next())
		{
			System.out.println("Login is successful");
		}else
		{
			System.out.println("Login is failure");
		}
	}

}
