package JdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedUpdate {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=Jdbc.getMysqlconnection();
		try {
		
		String s="update user SET name=?,email=? where id=?";
		PreparedStatement pStatement=connection.prepareStatement(s);
		pStatement.setString(1, "ishuuu");
		pStatement.setInt(3, 840);
	pStatement.setString(2, "ishakgmail.com");
		pStatement.executeUpdate();
		System.out.println("updated..");
		}
		
		catch (Exception e) {
		System.err.println(e);
		}
	}

}
