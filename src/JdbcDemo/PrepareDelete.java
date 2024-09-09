package JdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PrepareDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=Jdbc.getMysqlconnection();
		try {
		
		String s="delete from user where id=?";
		PreparedStatement pStatement=connection.prepareStatement(s);
		//pStatement.setString(1, "ishuuu");
		pStatement.setInt(1, 8540);
	//pStatement.setString(2, "ishakgmail.com");
		pStatement.executeUpdate();
		System.out.println("deleted...");
		}
		
		catch (Exception e) {
		System.err.println(e);
		}

	}

}
