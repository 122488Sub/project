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
			
		    String url = "jdbc:mysql://localhost:3306/ossw"; //db�̸�(ossw) �������
		    String id = "root"; // MySQL ID
		    
		    String password ="wodud7326@"; //��й�ȣ �������
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
		 * ���� �� sales���̺� ����
		 * seattable���̺� ����
		 * tableNUM : �¼���ȣ
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
		 * ���̺��� �޴� ����
		 * menu : �޴���ȣ(�޴��̸� X)
		 * tableNUM : �¼���ȣ
		 */
		int i;
		i = st.executeUpdate("delete from seattable where tableNUM = '" + tableNUM + "' and menuNUM = '" + menu +"';");
		if(i>0)
			System.out.println(i);
	}
	public void updateTable(String menu, String tableNUM, int num, int menutotal)throws SQLException {
		/*
		 * ���̺� �ֹ��޴�����
		 * menu : �޴���ȣ(�̸�X)
		 * tableNUM : �¼���ȣ
		 * num : �޴�����
		 * menutotal : ����(�޴����� * ����)
		 */
		int i;
		i = st.executeUpdate("update seattable set number = " + num + ", menutotal = " + menutotal + " where tableNUM = '" + tableNUM + "' and menuNUM = '" + menu + "';");
		if(i>0)
			System.out.println(i);
	}
	public ArrayList GetMenu(String part)throws SQLException {
		/*
		 * �޴���������
		 * part) 1 : ġŲ, 2 : ����, 3 : ���̵�
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
        
         *��ȯ�� �̷������� ���
		 */

	}
}
