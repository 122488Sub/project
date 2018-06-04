import java.awt.List;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;


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
	public void insertSales(int tableNUM)throws SQLException{
		/*
		 * 결제 후 sales테이블 삽입
		 * seattable테이블 삭제
		 * tableNUM : 좌석번호
		 */
		int i;
		DateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
		Date nowDate = new Date();
		String tempDate = sdFormat.format(nowDate);

		i = st.executeUpdate("insert sales values((select max(a.serial)+1 from sales as a), '" + tableNUM + "', "
				+ "(select sum(menutotal) from seattable where tableNUM = '" + tableNUM + "'), '" + tempDate + "');");
		
		if(i>0)
			System.out.println("insert : "+ i);
		
		i = st.executeUpdate("delete from seattable where tableNUM = '"+ tableNUM +"';");
		
		if(i>0)
			System.out.println("dalete : "+ i);
		
	}
	public void deleteTableMenu(String menu, String tableNUM)throws SQLException{
		/*
		 * 테이블에서 메뉴 삭제
		 * menu : 메뉴번호(메뉴이름 X)
		 * tableNUM : 좌석번호
		 */
		int i;
		i = st.executeUpdate("delete from seattable where tableNUM = '" + tableNUM + "' and menuNUM = '" + menu +"';");
		if(i>0)
			System.out.println(i);
	}
	public void updateTable(String menu, String tableNUM, int num, int menutotal)throws SQLException {
		/*
		 * 테이블에 주문메뉴수정
		 * menu : 메뉴번호(이름X)
		 * tableNUM : 좌석번호
		 * num : 메뉴갯수
		 * menutotal : 가격(메뉴가격 * 갯수)
		 */
		int i;
		i = st.executeUpdate("update seattable set number = " + num + ", menutotal = " + menutotal + " where tableNUM = '" + tableNUM + "' and menuNUM = '" + menu + "';");
		if(i>0)
			System.out.println(i);
	}
	public ArrayList GetMenu(String part)throws SQLException {
		/*
		 * 메뉴가져오기
		 * part) 1 : 치킨, 2 : 음료, 3 : 사이드
		 */
		ResultSet rs = null;
		ArrayList<DbDAO> li = new ArrayList<DbDAO>();
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


		return li;
		/*
		 * DbDAO data = null;
		for(int i = 0; i < li.size(); i++) {
			data = (DbDAO)li.get(i);
			data.getName();
        }
        
         *반환값 이런식으로 사용
		 */

	}
}
