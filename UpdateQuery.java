package JavaTest;
import java.sql.*;

public class UpdateQuery {
	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "SYSTEM";
		String password = "swathi";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		String updateQuery ="UPDATE DAY5 SET NAME3='RADHA' WHERE ID3=3";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM DAY5");
		System.out.println("Query execution" + rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("ID3") + " : " +  rs.getString("NAME3") + " : " + rs.getString("SUBJECT3") + " : " + rs.getString("MARKS3"));
		}
		con.close();

}
}
