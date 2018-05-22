import java.awt.*;
import javax.swing.*;

public class SeatPanel extends JPanel {
	
	public JPanel seatSelect_Panel;
	
	public JPanel Order_Panel, MenuPanel;
	public JButton select_Confirm_Button, select_Pay_Button, select_Cancel_Button;
	public JLabel seatNum_Label;
	
	public SeatPanel() {
		
		setPreferredSize(new Dimension(800,600));
		setBackground(Color.BLUE);
		setLayout(null);
		//-----------------------
		//좌석 선택시 화면
		
		seatSelect_Panel=new JPanel();
		seatSelect_Panel.setBounds(0,0,800,600);
		seatSelect_Panel.setLayout(null);
		seatSelect_Panel.setVisible(false); //초기화시 안보이게 설정
				
		////
		////선택한 좌석번호 표시 라벨
		////
		seatNum_Label = new JLabel("\uC88C\uC11D\uBC88\uD638(\uC608\uC815)");
		seatNum_Label.setFont(new Font("나눔고딕", Font.BOLD, 24));
		seatNum_Label.setBounds(12, 10, 156, 29);
		seatSelect_Panel.add(seatNum_Label);
		////
		////주문내역 패널
		////
		Order_Panel = new JPanel();
		Order_Panel.setBackground(new Color(240, 255, 240));
		Order_Panel.setBounds(12, 49, 375, 488);
		seatSelect_Panel.add(Order_Panel);
		////
		////메뉴선택 패널
		////
		MenuPanel = new JPanel();
		MenuPanel.setBackground(new Color(245, 255, 250));
		MenuPanel.setBounds(418, 49, 353, 488);
		seatSelect_Panel.add(MenuPanel);
		////
		////선택화면 취소버튼
		////
		select_Cancel_Button = new JButton("\uCDE8\uC18C");
		select_Cancel_Button.setFont(new Font("나눔고딕", Font.BOLD, 24));
		select_Cancel_Button.setBounds(418, 547, 100, 40);
		seatSelect_Panel.add(select_Cancel_Button);
		////
		////선택화면 확인버튼
		////
		select_Confirm_Button = new JButton("\uD655\uC778");
		select_Confirm_Button.setFont(new Font("나눔고딕", Font.BOLD, 24));
		select_Confirm_Button.setBounds(544, 547, 100, 40);
		seatSelect_Panel.add(select_Confirm_Button);
		////
		////선택화면 결제버튼
		////
		select_Pay_Button = new JButton("\uACB0\uC81C");
		select_Pay_Button.setFont(new Font("나눔고딕", Font.BOLD, 24));
		select_Pay_Button.setBounds(671, 547, 100, 40);
		seatSelect_Panel.add(select_Pay_Button);
				
		add(seatSelect_Panel);
		
	}
}
