
public class DbDAO {
	private int seatNum;			// =tableNUM	
	private String menuNum;		//메뉴식별
	private String name;			//메뉴이름
	private int price_menu;		//메뉴가격
	private String part;			//분류
	private int menu_total;		//총가격
	private int number;			//개수
	private String time;			//날짜
	private int total_price;		//매출
	
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
