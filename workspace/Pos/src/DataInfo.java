import java.sql.*;
public class DataInfo {

	public int seatNum;
	
	public DataInfo() throws SQLException {
		
		String driverName="com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/ossw";
	    String id = "root"; // MySQL ID
	    String password ="tjqtjq";
	    Connection conn;
	    try {
	    	Class.forName(driverName);
	    	
	    }catch(ClassNotFoundException e) {
	    	e.printStackTrace();
	    }
	    
	    
		conn = DriverManager.getConnection(url, id, password);
		
	    
	    
	}

}
