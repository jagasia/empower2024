import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class AppMetaData {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement st = con.prepareStatement("SELECT * FROM DEPARTMENTS");
		
		ResultSet rs = st.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnCount());
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{
			System.out.print(rsmd.getColumnTypeName(i)+"\t");
		}
		
		
	}

}
