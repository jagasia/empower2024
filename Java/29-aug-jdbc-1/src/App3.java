import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App3 {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement st = con.prepareStatement("SELECT * FROM DEPARTMENTS");
		
		ResultSet rs = st.executeQuery();
		System.out.printf("%-3s\t%-20s\t%-3s\t%-3s\n","Id","Name","Manager","Location");
		while(rs.next())
		{
			System.out.printf("%-3s\t%-20s\t%-3s\t%-3s\n",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4));
		}
	}

}
