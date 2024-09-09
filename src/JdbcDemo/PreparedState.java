package JdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedState {

	public static void main(String[] args) throws SQLException {
		Connection connection=Jdbc.getMysqlconnection();
		try {
			
		
		String s="insert into user values(?,?,?)";
		PreparedStatement pStatement=connection.prepareStatement(s);
		pStatement.setString(1, "siri");
		pStatement.setInt(2, 840);
		pStatement.setString(3, "siri@gmail.com");
		pStatement.executeUpdate();
		System.out.println("inserted ");
		Statement st=connection.createStatement();
		st.execute("drop table user");
		}
		catch (Exception e) {
			// TODO: handle exception
			
		}
	}

}
