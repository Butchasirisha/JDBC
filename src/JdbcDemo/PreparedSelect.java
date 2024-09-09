package JdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=Jdbc.getMysqlconnection();
		try {
		
		String s="select * from user ";
		PreparedStatement pStatement=connection.prepareStatement(s);
		//pStatement.setString(1, "ishuuu");
		//pStatement.setInt(1, 8540);
	//pStatement.setString(2, "ishakgmail.com");
	ResultSet rSet=pStatement.executeQuery();
		System.out.println("deleted...");
		if(rSet.next())
		{
			System.out.println(rSet.getString(1)+rSet.getInt(2));
		}
		}
		
		catch (Exception e) {
		System.err.println(e);
		}
	}

}
