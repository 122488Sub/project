
public class DbDAO {
	private int seatNum;			// =tableNUM	
	private String menuNum;		//�޴��ĺ�
	private String name;			//�޴��̸�
	private int price_menu;		//�޴�����
	private String part;			//�з�
	private int menu_total;		//�Ѱ���
	private int number;			//����
	private String time;			//��¥
	private int total_price;		//����
	
	public void setSeatNum(int i) {
		seatNum = i;
	}
	public int getSeatNum() {
		return seatNum;
	}
	
	public void setMenuNum(String s) {
		menuNum = s;
	}
	public String getMenuNum() {
		return menuNum;
	}
	
	public void setName(String s) {
		name = s;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice_menu(int i) {
		price_menu = i;
	}
	public int getPrice_menu() {
		return price_menu;
	}
	
	public void setPart(String s) {
		part = s;
	}
	public String getPart() {
		return part;
	}
	
	public void setMenutotal(int i) {
		menu_total = i;
	}
	public int getMenutotal() {
		return menu_total;
	}
	
	public void setTime(String s) {
		time = s;
	}
	public String getTime() {
		return time;
	}
	
	public void setNumber(int i) {
		number = i;
	}
	public int getNumber() {
		return number;
	}
	
	public void setTotaprice(int i) {
		total_price = i;
	}
	public int getTotaprice() {
		return total_price;
	}
}
