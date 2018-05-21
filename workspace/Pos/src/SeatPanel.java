import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;


public class SeatPanel extends JPanel {
	DataInfo d;
	private JPanel seatAll_Panel;
	private JLabel seatAll_Label;
	
	
	
	//w:60 h:215
	private JPanel seat1_Panel, seat2_Panel, seat3_Panel, 
					seat4_Panel, seat5_Panel, seat6_Panel,
					seat7_Panel,seat8_Panel;
	private JLabel seat1_Name_Label, seat2_Name_Label, seat3_Name_Label, seat4_Name_Label, 
					seat5_Name_Label, seat6_Name_Label, seat7_Name_Label, seat8_Name_Label; 
	private JLabel seat1_Price_Label, seat2_Price_Label, seat3_Price_Label, seat4_Price_Label, 
					seat5_Price_Label, seat6_Price_Label, seat7_Price_Label, seat8_Price_Label; 	
	private JButton test;

	//
	private JPanel seatSelect_Panel;
	
	private JPanel Order_Panel, MenuPanel;
	private JButton select_Confirm_Button, select_Pay_Button, select_Cancel_Button;
	private JLabel seatNum_Label;
	
	public SeatPanel(){
		
		setPreferredSize(new Dimension(800,600));
		setBackground(Color.WHITE);
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
		select_Cancel_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		select_Cancel_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Cancel_Button.setBounds(418, 547, 100, 40);
		seatSelect_Panel.add(select_Cancel_Button);
		////
		////����ȭ�� Ȯ�ι�ư
		////
		select_Confirm_Button = new JButton("\uD655\uC778");
		select_Confirm_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		select_Confirm_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Confirm_Button.setBounds(544, 547, 100, 40);
		seatSelect_Panel.add(select_Confirm_Button);
		////
		////����ȭ�� ������ư
		////
		select_Pay_Button = new JButton("\uACB0\uC81C");
		select_Pay_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		select_Pay_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Pay_Button.setBounds(671, 547, 100, 40);
		seatSelect_Panel.add(select_Pay_Button);
				
		
	}
}
