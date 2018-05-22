import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.event.*;

//**********************************************************************
//***MainPanel 생성자 - 모든 클래스 관리***
//**********************************************************************

public class MainPanel extends JPanel {
	
	//**********************************************************************
	//***변수***
	//**********************************************************************
	//상수 & DB값
	DataInfo data;
	//전체 좌석화면
	private SeatAllPanel main_Panel;
	//선택 좌석화면
	private SeatPanel seat_Panel;
	
	//**********************************************************************
	//***MainPanel 생성자 - 모든 클래스 생성 및 이벤트 관리***
	//**********************************************************************
	public MainPanel() throws SQLException {

		//기본크기 800x600
		setPreferredSize(new Dimension(800, 600));
		setBackground(Color.WHITE);
		setLayout(null);
		
		data = new DataInfo();
		//**********************************************************************
		//
		// 전체 좌석화면 설정
		//
		main_Panel= new SeatAllPanel();
		
		////
		////전체 좌석화면: 좌석 선택시 화면전환 이벤트 실시
		////
		main_Panel.seat1_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_AlltoSel_Change(1);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(1);
			}
		});
		main_Panel.seat2_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_AlltoSel_Change(2);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(2);
			}
		});
		main_Panel.seat3_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_AlltoSel_Change(3);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(3);
			}
		});
		main_Panel.seat4_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_AlltoSel_Change(4);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(4);
			}
		});
		main_Panel.seat5_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				seat_AlltoSel_Change(5);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(5);
			}
		});
		main_Panel.seat6_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_AlltoSel_Change(6);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(6);
			}
		});
		main_Panel.seat7_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_AlltoSel_Change(7);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(7);
			}
		});
		main_Panel.seat8_Panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_AlltoSel_Change(8);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_AlltoSel_Change(8);
			}
		});
		//**********************************************************************
		//
		// 좌석 선택시 화면
		seat_Panel = new SeatPanel();
		//
		////
		////좌석선택화면: 취소버튼
		////
		seat_Panel.select_Cancel_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_SeltoAll_Cancel_Change();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_SeltoAll_Cancel_Change();
			}
		});
		////
		////좌석선택화면: 확인버튼
		////
		seat_Panel.select_Confirm_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_SeltoAll_Confirm_Change();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_SeltoAll_Confirm_Change();
			}
		});
		////
		////좌석선택화면: 결제버튼
		////
		seat_Panel.select_Pay_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				seat_SeltoAll_Pay_Change();
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				seat_SeltoAll_Pay_Change();
			}
		});
		
		
		//**********************************************************************
		//처음에는 전체좌석화면만 보이도록 설정
		this.add(main_Panel.seatAll_Panel);
		this.add(seat_Panel.seatSelect_Panel);
	}
	
	//**********************************************************************
	//***화면 전환 관리 함수***
	//**********************************************************************

	public void seat_SeltoAll_Cancel_Change() {
		//취소(주문완료 안하고 취소) DB저장안하고 그냥나오기
		main_Panel.seatAll_Panel.setVisible(true);
		seat_Panel.seatSelect_Panel.setVisible(false);
	}
	
	public void seat_SeltoAll_Confirm_Change() {
		//확인(메뉴주문)시 DB저장 필요
		main_Panel.seatAll_Panel.setVisible(true);
		seat_Panel.seatSelect_Panel.setVisible(false);
	}
	
	public void seat_SeltoAll_Pay_Change() {
		//결제와 관련된 창 필요
		//DB추가이후 작업
	}
	
	public void seat_AlltoSel_Change(int _seatNum) {
		
		data.seatNum= _seatNum;
	
		//변경시 각 좌석별 내용 변동시키기
		seat_Panel.seatNum_Label.setText("No."+data.seatNum + " Table");
		//***선택 좌석의 현재 주문상태 추가하기***
		
		//패널전환
		main_Panel.seatAll_Panel.setVisible(false);
		seat_Panel.seatSelect_Panel.setVisible(true);
		
	}
}
