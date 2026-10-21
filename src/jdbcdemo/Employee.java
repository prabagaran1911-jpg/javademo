package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/dummy";
		String username="root";
		String password="root";
		String query="insert into employee value('kalai',34,'javascript')";

     try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
	Connection con=	DriverManager.getConnection(url, username, password);
    Statement stmt=	con.createStatement();
      stmt.executeUpdate(query);
//     while( rs.next()) {
//    	  System.out.println(" name :"+rs.getString("name")+
//    	  " age :" +rs.getInt("age")+
//    	  " course :"+ rs.getString("course"));
//    	    
//     }
    
		
		
	 } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }

	}

}
