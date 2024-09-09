package JdbcDemo;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		try {
		
		
		Connection connection=Jdbc.getMysqlconnection();
		Statement statement=connection.createStatement();
		statement.execute("create table user(name varchar(20),userid int,email varchar(20))");
		System.out.println("table created....");
		}
		catch (Exception e) {
			System.err.println(e);
		}
		

	}

}
