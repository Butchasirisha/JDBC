package JdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MultiPreparedState {
	public static void main(String[] args) {
		Connection connection=Jdbc.getMysqlconnection();
		try {
		
		String s="insert into user values(?,?,?)";
		PreparedStatement pStatement=connection.prepareStatement(s);
		pStatement.setString(1, "ishasiri");
		pStatement.setInt(2, 8540);
		pStatement.setString(3, "isha@gmail.com");
		pStatement.addBatch();
		//pStatement.executeUpdate();
		pStatement.setString(1, "ishasirisha");
		pStatement.setInt(2, 845440);
		pStatement.setString(3, "ishas@gmail.com");
		pStatement.addBatch();
		pStatement.executeBatch();
		System.out.println("inserted ");
		
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}

}
