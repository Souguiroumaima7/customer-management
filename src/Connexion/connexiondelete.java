package Connexion;

import java.sql.*;

public class connexiondelete {
	 static final String DB_URL = "jdbc:mysql://localhost:3306/demojdbc";
	 static final String USER = "root";
	 static final String PASS = "Sousou54181140@";
	 static final String QUERY = "SELECT id, nom, prenom FROM client";
	public static void main(String[] args) {
		
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         String sql = "DELETE id FROM client " +
		            "WHERE id = 3";
		         stmt.executeUpdate(sql);
		         ResultSet rs = stmt.executeQuery(QUERY);
		         while(rs.next()){
		            //Display values
		            System.out.print("ID: " + rs.getInt("id"));
		            System.out.print(", nom: " + rs.getInt("nom"));
		            System.out.print(", prenom : " + rs.getString("prenom"));
		         
		         }
		         rs.close();
		      } catch (SQLException e) {
		         e.printStackTrace();
	}

}
}
