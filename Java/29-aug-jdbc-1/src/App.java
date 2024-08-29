import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEES");
		while(rs.next())
		{
			System.out.println(rs.getString("first_name"));
		}
		System.out.println("Hello world");
	}

}
