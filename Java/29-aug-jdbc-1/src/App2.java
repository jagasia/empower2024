import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		String password=sc.nextLine();
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement st = con.prepareStatement("SELECT * FROM USER_MASTER WHERE USERNAME=? AND PASSWORD=?");
		st.setString(1, username);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			System.out.println("Login is successful");
		}else
		{
			System.out.println("Login is failure");
		}
	}

}
