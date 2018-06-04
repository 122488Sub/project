import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
import java.awt.event.*;

//**********************************************************************
//***MainPanel ������ - ��� Ŭ���� ����***
//**********************************************************************

public class MainPanel extends JPanel {

	// **********************************************************************
	// ***����***
	// **********************************************************************
	// ��� & DB��
	DataInfo data;
	DbDAO DB;
	// ��ü �¼�ȭ��
	private SeatAllPanel main_Panel;
	// ���� �¼�ȭ��
	private SeatPanel seat_Panel;

	// **********************************************************************
	// ***MainPanel ������ - ��� Ŭ���� ���� �� �̺�Ʈ ����***
	// **********************************************************************
	public MainPanel() throws SQLException {

		// �⺻ũ�� 800x600
		setPreferredSize(new Dimension(800, 600));
		setBackground(Color.WHITE);
		setLayout(null);
		DB = new DbDAO();
		data = new DataInfo();
		// **********************************************************************
		//
		// ��ü �¼�ȭ�� ����
		//
		main_Panel = new SeatAllPanel();

		////
		//// ��ü �¼�ȭ��: �¼� ���ý� ȭ����ȯ �̺�Ʈ �ǽ�
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
		// **********************************************************************
		//
		// �¼� ���ý� ȭ��
		seat_Panel = new SeatPanel();
		//
		////
		//// �¼�����ȭ��: ��ҹ�ư
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
		//// �¼�����ȭ��: Ȯ�ι�ư
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
		//// �¼�����ȭ��: ������ư
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
			//
		});
		
		// **********************************************************************
		// ó������ ��ü�¼�ȭ�鸸 ���̵��� ����
		this.add(main_Panel.seatAll_Panel);
		this.add(seat_Panel.seatSelect_Panel);
	}

	// **********************************************************************
	// ***ȭ�� ��ȯ ���� �Լ�***
	// **********************************************************************

	public void seat_SeltoAll_Cancel_Change() {
		// ���(�ֹ��Ϸ� ���ϰ� ���) DB������ϰ� �׳ɳ�����
		main_Panel.seatAll_Panel.setVisible(true);
		seat_Panel.seatSelect_Panel.setVisible(false);
	}

	public void seat_SeltoAll_Confirm_Change() {
		// Ȯ��(�޴��ֹ�)�� DB���� �ʿ�
		main_Panel.seatAll_Panel.setVisible(true);
		seat_Panel.seatSelect_Panel.setVisible(false);
	}

	public void seat_SeltoAll_Pay_Change() {
		// ������ ���õ� â �ʿ�
		// DB�߰����� �۾�
		try {
			/*
			 * ������ư Ŭ���� data ���� ����
			 */
			data.insertSales(DB.getSeatNum());
		} catch (SQLException S) {

		}
	}

	public void seat_AlltoSel_Change(int _seatNum) {
		DB.setSeatNum(_seatNum);
		ArrayList<DbDAO> li = new ArrayList<DbDAO>();
		try {
			li = data.GetSeat(DB.getSeatNum());
			for (int i = 0; i < li.size(); i++) {
				System.out.println(i);
				DbDAO order = li.get(i);
				System.out.println(order.getMenuNum());
				System.out.println(order.getName());
				System.out.println(order.getNumber());
				System.out.println(order.getTotaprice());

			}
		} catch (SQLException e) {

		}
		// ����� �� �¼��� ���� ������Ű��
		seat_Panel.seatNum_Label.setText("No." + DB.getSeatNum() + " Table");
		// ***���� �¼��� ���� �ֹ����� �߰��ϱ�***

		// �г���ȯ
		main_Panel.seatAll_Panel.setVisible(false);
		seat_Panel.seatSelect_Panel.setVisible(true);
		seat_Panel.Change_chic();
	}
}
