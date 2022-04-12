package Connexion;

import java.sql.*;

public class Connexion {
	 static final String DB_URL = "jdbc:mysql://localhost:3306/demojdbc";
	 static final String USER = "root";
	 static final String PASS = "Sousou54181140@";
	
	 
	 public static void main(String[] args) throws SQLException  {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	    		
	    		)  
	    	  {
	    			  // Execute a query
	    		         System.out.println("Inserting records into the table...");          
	    		         String sql = "INSERT INTO client VALUES (1"
	    		         		+ ", 'amine', 'knani')";
	    		         String sql1 = "INSERT INTO client VALUES (2"
		    		         		+ ", 'amine', 'souguir')";
	    		         String sql2 = "INSERT INTO client VALUES (3"
		    		         		+ ", 'dali', 'knani')";
	    		         String sql3 = "INSERT INTO client VALUES (4"
		    		         		+ ", 'douaa', 'knani')";
	    		         String sql4 = "INSERT INTO client VALUES (5"
		    		         		+ ", 'amina', 'knani')";
	    		         stmt.executeUpdate(sql);           
	    		         stmt.executeUpdate(sql1);  
	    		         stmt.executeUpdate(sql2); 
	    		         stmt.executeUpdate(sql3); 
	    		         stmt.executeUpdate(sql4); 
	    		         
	    	  }   	
	     
}
	 
}
