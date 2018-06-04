import java.awt.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;


public class DataInfo {
	java.sql.Statement st = null;
	
	/*
	 * 	DateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
		Date nowDate = new Date();
		String tempDate = sdFormat.format(nowDate);


	 */

	public DataInfo() throws SQLException {
	try {	
		String driverName="com.mysql.jdbc.Driver";
		//String driverName="com.mysql.cj.jdbc.Driver";
		
	    String url = "jdbc:mysql://localhost:3306/ossw"; //db이름(ossw) 맞춰야함
	    String id = "root"; // MySQL ID
	    
	    String password ="wodud7326@"; //비밀번호 맞춰야함
	    Connection conn;
	    try {
	    	Class.forName(driverName);
	    	
	    }catch(ClassNotFoundException e) {
	    	System.out.println(e);
	    	e.printStackTrace();
	    }
	    
	    
		conn = DriverManager.getConnection(url, id, password);

		//ResultSet rs = null;

		st = conn.createStatement();
/*
		rs = st.executeQuery("select * from menutable");

		if (st.execute("select * from menutable")) {
			
			rs = st.getResultSet();

		}
		while (rs.next()) {
			String str = rs.getString(1);
			System.out.println(str);

		}
*/
	}catch(SQLException sqex) {
		System.out.println("SQLException: " + sqex.getMessage());

		System.out.println("SQLState: " + sqex.getSQLState());

	}


	}
    
	public ArrayList GetMenu(String part)throws SQLException {
		/*
		 * 메뉴가져오기
		 * part) 1 : 치킨, 2 : 음료, 3 : 사이드
		 */
		DbDAO test = new DbDAO();
		ResultSet rs = null;
		ArrayList<DbDAO> li = new ArrayList<DbDAO>();
		System.out.println("part : " + part);
		int i=0;
		rs = st.executeQuery("select * from menutable where part = '"+part+"';");
		
		if (
			st.execute("select * from menutable where part = '"+part+"';")) {
			
			rs = st.getResultSet();

		}
		while (rs.next()) {
			DbDAO data = new DbDAO();
			
			data.setMenuNum(rs.getString(1)) ;
			data.setName(rs.getString(2));
			data.setPrice_menu(rs.getInt(3));
			data.setPart(rs.getString(4));
			li.add(data);
		}
		/*
		 * DbDAO data = null;
		for(int i = 0; i < li.size(); i++) {
			data = (DbDAO)li.get(i);
			data.getName();
        }
        
         *반환값 이런식으로 사용
		 */


		return li;
	}
}
