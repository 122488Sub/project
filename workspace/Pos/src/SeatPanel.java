import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class SeatPanel extends JPanel {

	public JLabel seatNum_Label;

	public JPanel seatSelect_Panel;

	public JPanel Order_Panel;

	public JPanel MenuPanel;
	public JPanel menuPan_Panel;
	public JLabel chic_Label, drink_Label, side_Label;

	public JButton select_Confirm_Button, select_Pay_Button, select_Cancel_Button;

	DataInfo data;
	DbDAO DB;
	private ArrayList<DbDAO> cickArray, sideArray, drinkArray;
	
	private JButton menuPan_Btn_0;
	private JButton menuPan_Btn_1;
	private JButton menuPan_Btn_2;
	private JButton menuPan_Btn_3;
	private JButton menuPan_Btn_4;
	private JButton menuPan_Btn_5;
	
	
	
	public SeatPanel() throws SQLException {

		setPreferredSize(new Dimension(800, 600));
		setBackground(Color.BLUE);
		setLayout(null);
		// ------------------------------
		DB = new DbDAO();
		data = new DataInfo();
	
		
		cickArray = data.GetMenu("1");	
		drinkArray = data.GetMenu("2");
		sideArray = data.GetMenu("3");
		
		// -----------------------
		// �¼� ���ý� ȭ��

		seatSelect_Panel = new JPanel();
		seatSelect_Panel.setBounds(0, 0, 800, 600);
		seatSelect_Panel.setLayout(null);
		seatSelect_Panel.setVisible(false); // �ʱ�ȭ�� �Ⱥ��̰� ����

		////
		//// ������ �¼���ȣ ǥ�� ��
		////
		seatNum_Label = new JLabel("\uC88C\uC11D\uBC88\uD638(\uC608\uC815)");
		seatNum_Label.setFont(new Font("�������", Font.BOLD, 24));
		seatNum_Label.setBounds(12, 10, 156, 29);
		seatSelect_Panel.add(seatNum_Label);
		////
		//// �ֹ����� �г�
		////
		Order_Panel = new JPanel();
		Order_Panel.setBackground(new Color(240, 255, 240));
		Order_Panel.setBounds(12, 49, 330, 488);
		Order_Panel.setLayout(null);
		seatSelect_Panel.add(Order_Panel);
		////
		//// �޴����� �г�
		////
		MenuPanel = new JPanel();
		MenuPanel.setBackground(new Color(245, 255, 250));
		MenuPanel.setBounds(371, 50, 400, 485);
		MenuPanel.setLayout(null);
		seatSelect_Panel.add(MenuPanel);
		//------------------------------------------------------
		//------------------------------------------------------
		////
		////
		////�޴��� �г�
		menuPan_Panel = new JPanel();
		menuPan_Panel.setBackground(Color.PINK);
		menuPan_Panel.setBounds(25, 114, 346, 337);
		menuPan_Panel.setLayout(null);
		MenuPanel.add(menuPan_Panel);
		//////
		//////
		//////�޴��� �гξ� ��ư
		menuPan_Btn_0 = new JButton(cickArray.get(0).getName());
		menuPan_Btn_0.setBounds(35, 69, 127, 59);
		menuPan_Btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(menuPan_Btn_0.getToolTipText());
			}
		});
		menuPan_Panel.add(menuPan_Btn_0);
		
		menuPan_Btn_1 = new JButton(cickArray.get(1).getName());
		menuPan_Btn_1.setBounds(188, 69, 127, 59);
		menuPan_Btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(menuPan_Btn_1.getToolTipText());
			}
		});
		menuPan_Panel.add(menuPan_Btn_1);
		
		menuPan_Btn_2 = new JButton(cickArray.get(2).getName());
		menuPan_Btn_2.setBounds(35, 188, 127, 59);
		menuPan_Btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(menuPan_Btn_2.getToolTipText());
			}
		});
		menuPan_Panel.add(menuPan_Btn_2);
		
		menuPan_Btn_3 = new JButton(cickArray.get(3).getName());
		menuPan_Btn_3.setBounds(188, 188, 127, 59);
		menuPan_Btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(menuPan_Btn_3.getToolTipText());
			}
		});
		menuPan_Panel.add(menuPan_Btn_3);
		
		menuPan_Btn_4 = new JButton(drinkArray.get(4).getName());
		menuPan_Btn_4.setBounds(35, 245, 127, 59);
		menuPan_Btn_4.setVisible(false);
		menuPan_Btn_4.setToolTipText(""+drinkArray.get(4).getPrice_menu());
		menuPan_Btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(menuPan_Btn_4.getToolTipText());
			}
		});
		menuPan_Panel.add(menuPan_Btn_4);
		
		menuPan_Btn_5 = new JButton(drinkArray.get(5).getName());
		menuPan_Btn_5.setToolTipText("");
		menuPan_Btn_5.setBounds(188, 245, 127, 59);
		menuPan_Btn_5.setVisible(false);
		menuPan_Btn_5.setToolTipText(""+drinkArray.get(5).getPrice_menu());
		menuPan_Btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(menuPan_Btn_5.getToolTipText());
			}
		});
		menuPan_Panel.add(menuPan_Btn_5);

		//------------------------------------------------------
		//------------------------------------------------------
		//////
		//////
		//////�޴����� �� : �ش� �� Ŭ���� �� �������� ��ȯ�ϴ� �̺�Ʈ�� Change_ () ����
		chic_Label = new JLabel("Chicken");
		chic_Label.setFont(new Font("�������", Font.BOLD, 16));
		chic_Label.setHorizontalAlignment(SwingConstants.CENTER);
		chic_Label.setOpaque(true);
		chic_Label.setBackground(Color.PINK);
		chic_Label.setBounds(25, 59, 107, 55);
		chic_Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Change_chic();
			}
		});

		MenuPanel.add(chic_Label);

		drink_Label = new JLabel("Drink");
		drink_Label.setFont(new Font("�������", Font.BOLD, 16));
		drink_Label.setHorizontalAlignment(SwingConstants.CENTER);
		drink_Label.setOpaque(true);
		drink_Label.setBackground(Color.ORANGE);
		drink_Label.setBounds(144, 59, 107, 55);
		drink_Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Change_drink();
			}
		});
		MenuPanel.add(drink_Label);

		side_Label = new JLabel("Side");
		side_Label.setFont(new Font("�������", Font.BOLD, 16));
		side_Label.setHorizontalAlignment(SwingConstants.CENTER);
		side_Label.setOpaque(true);
		side_Label.setBackground(Color.YELLOW);
		side_Label.setBounds(261, 59, 110, 55);
		side_Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Change_side();
			}
		});
		MenuPanel.add(side_Label);
		////
		//// ����ȭ�� ��ҹ�ư
		////
		select_Cancel_Button = new JButton("\uCDE8\uC18C");
		select_Cancel_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Cancel_Button.setBounds(418, 547, 100, 40);
		seatSelect_Panel.add(select_Cancel_Button);
		////
		//// ����ȭ�� Ȯ�ι�ư
		////
		select_Confirm_Button = new JButton("\uD655\uC778");
		select_Confirm_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Confirm_Button.setBounds(544, 547, 100, 40);
		seatSelect_Panel.add(select_Confirm_Button);
		////
		//// ����ȭ�� ������ư
		////
		select_Pay_Button = new JButton("\uACB0\uC81C");
		select_Pay_Button.setFont(new Font("�������", Font.BOLD, 24));
		select_Pay_Button.setBounds(671, 547, 100, 40);
		seatSelect_Panel.add(select_Pay_Button);

		add(seatSelect_Panel);

	}
	//��ư 4��-> 6�� ��ȯ [Change->���� ���]
	void Btn4To6() {
		menuPan_Btn_0.setBounds(35, 36, 127, 59);
		menuPan_Btn_1.setBounds(188, 36, 127, 59);
		menuPan_Btn_2.setBounds(35, 145, 127, 59);
		menuPan_Btn_3.setBounds(188, 145, 127, 59);
		
		menuPan_Btn_4.setVisible(true);
		menuPan_Btn_5.setVisible(true);
	
	}
	//��ư 6��-> 4�� ��ȯ
	void Btn6To4() {
		menuPan_Btn_0.setBounds(35, 69, 127, 59);
		menuPan_Btn_1.setBounds(188, 69, 127, 59);
		menuPan_Btn_2.setBounds(35, 188, 127, 59);
		menuPan_Btn_3.setBounds(188, 188, 127, 59);
		
		menuPan_Btn_4.setVisible(false);
		menuPan_Btn_5.setVisible(false);
	
	}
	
	public void Change_chic() {
	
		Btn6To4();
		menuPan_Panel.setBackground(Color.PINK);
		menuPan_Btn_0.setText(cickArray.get(0).getName());
		menuPan_Btn_0.setToolTipText(""+cickArray.get(0).getPrice_menu());
		menuPan_Btn_1.setText(cickArray.get(1).getName());
		menuPan_Btn_1.setToolTipText(""+cickArray.get(1).getPrice_menu());
		menuPan_Btn_2.setText(cickArray.get(2).getName());
		menuPan_Btn_2.setToolTipText(""+cickArray.get(2).getPrice_menu());
		menuPan_Btn_3.setText(cickArray.get(3).getName());
		menuPan_Btn_3.setToolTipText(""+cickArray.get(3).getPrice_menu());
	}

	public void Change_drink() {
	
		Btn4To6();
		menuPan_Panel.setBackground(Color.ORANGE);
		menuPan_Btn_0.setText(drinkArray.get(0).getName());
		menuPan_Btn_0.setToolTipText(""+drinkArray.get(0).getPrice_menu());
		menuPan_Btn_1.setText(drinkArray.get(1).getName());
		menuPan_Btn_1.setToolTipText(""+drinkArray.get(1).getPrice_menu());
		menuPan_Btn_2 .setText(drinkArray.get(2).getName());
		menuPan_Btn_2.setToolTipText(""+drinkArray.get(2).getPrice_menu());
		menuPan_Btn_3 .setText(drinkArray.get(3).getName());
		menuPan_Btn_3.setToolTipText(""+drinkArray.get(3).getPrice_menu());
	}
	public void Change_side() {
	
		Btn6To4();
		menuPan_Panel.setBackground(Color.YELLOW);
		menuPan_Btn_0.setText(sideArray.get(0).getName());
		menuPan_Btn_0.setToolTipText(""+sideArray.get(0).getPrice_menu());
		menuPan_Btn_1.setText(sideArray.get(1).getName());
		menuPan_Btn_1.setToolTipText(""+sideArray.get(1).getPrice_menu());
		menuPan_Btn_2.setText(sideArray.get(2).getName());
		menuPan_Btn_2.setToolTipText(""+sideArray.get(2).getPrice_menu());
		menuPan_Btn_3.setText(sideArray.get(3).getName());
		menuPan_Btn_3.setToolTipText(""+sideArray.get(3).getPrice_menu());
	}
}
