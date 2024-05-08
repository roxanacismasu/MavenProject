package curs16;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbQuerys {

	public static List<String> dbSelectQuery(Connection conn, String query){
		
		List<String> resultList = new ArrayList<String>();
		
		try {
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				resultList.add(resultSet.getString(6));
				
			}
			
		}catch(SQLException e) {
			System.out.println("Nu am putut executa query-ul");
			e.printStackTrace();
		}
		
		return resultList;
		
	}
	
	public static void dbUpdateQuery(Connection conn, String query) {
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Am facut update");
			
			
		}catch(SQLException e) {
			System.out.println("Nu am putut face update-ul");
			e.printStackTrace();
		}
	}
	
	public static void dbDeleteQuery(Connection conn, String query) {
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Am facut delete");
			
			
		}catch(SQLException e) {
			System.out.println("Nu am putut face delete-ul");
			e.printStackTrace();
		}
	}
}
