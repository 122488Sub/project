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
		//�¼� ���ý� ȭ��
		
		seatSelect_Panel=new JPanel();
		seatSelect_Panel.setBounds(0,0,800,600);
		seatSelect_Panel.setLayout(null);
		seatSelect_Panel.setVisible(false); //�ʱ�ȭ�� �Ⱥ��̰� ����
				
		////
		////������ �¼���ȣ ǥ�� ��
		////
		seatNum_Label = new JLabel("\uC88C\uC11D\uBC88\uD638(\uC608\uC815)");
		seatNum_Label.setFont(new Font("�������", Font.BOLD, 24));
		seatNum_Label.setBounds(12, 10, 156, 29);
		seatSelect_Panel.add(seatNum_Label);
		////
		////�ֹ����� �г�
		////
		Order_Panel = new JPanel();
		Order_Panel.setBackground(new Color(240, 255, 240));
		Order_Panel.setBounds(12, 49, 375, 488);
		seatSelect_Panel.add(Order_Panel);
		////
		////�޴����� �г�
		////
		MenuPanel = new JPanel();
		MenuPanel.setBackground(new Color(245, 255, 250));
		MenuPanel.setBounds(418, 49, 353, 488);
		seatSelect_Panel.add(MenuPanel);
		////
		////����ȭ�� ��ҹ�ư
		////
		select_Cancel_Button = new JButton("\uCDE8\uC18C");
		select_Cancel_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Cancel_Button.setBounds(418, 547, 100, 40);
		seatSelect_Panel.add(select_Cancel_Button);
		////
		////����ȭ�� Ȯ�ι�ư
		////
		select_Confirm_Button = new JButton("\uD655\uC778");
		select_Confirm_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Confirm_Button.setBounds(544, 547, 100, 40);
		seatSelect_Panel.add(select_Confirm_Button);
		////
		////����ȭ�� ������ư
		////
		select_Pay_Button = new JButton("\uACB0\uC81C");
		select_Pay_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Pay_Button.setBounds(671, 547, 100, 40);
		seatSelect_Panel.add(select_Pay_Button);
				
		add(seatSelect_Panel);
		
	}
}
