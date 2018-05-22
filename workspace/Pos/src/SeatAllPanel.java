import java.awt.*;
import javax.swing.*;

public class SeatAllPanel extends JPanel {

	// ÀüÃ¼ ÁÂ¼®È­¸é
	public JPanel seatAll_Panel;
	public JLabel seatAll_Label;
	public JPanel seat1_Panel, seat2_Panel, seat3_Panel, seat4_Panel, seat5_Panel, seat6_Panel, seat7_Panel,
			seat8_Panel;
	public JLabel seat1_Name_Label, seat2_Name_Label, seat3_Name_Label, seat4_Name_Label, seat5_Name_Label,
			seat6_Name_Label, seat7_Name_Label, seat8_Name_Label;
	public JLabel seat1_Price_Label, seat2_Price_Label, seat3_Price_Label, seat4_Price_Label, seat5_Price_Label,
			seat6_Price_Label, seat7_Price_Label, seat8_Price_Label;
	
	public SeatAllPanel() {
		
		setPreferredSize(new Dimension(800,600));
		setBackground(Color.RED);
		setLayout(null);
		
		//----------------------------------------
		seatAll_Panel = new JPanel();
		seatAll_Panel.setBounds(0, 0, 800, 600);
		seatAll_Panel.setLayout(null);

		seatAll_Label = new JLabel(new ImageIcon("img\\img_Seat.png"));
		seatAll_Label.setBounds(0, 0, 800, 600);
		seatAll_Label.setLayout(null);
		seatAll_Panel.add(seatAll_Label);

		//// ÁÂ¼®1
		seat1_Panel = new JPanel();
		seat1_Panel.setBounds(30, 55, 160, 215);
		seat1_Panel.setLayout(null);
		seat1_Panel.setOpaque(false);

		seat1_Name_Label = new JLabel("No.1");
		seat1_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat1_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat1_Name_Label.setBounds(0, 0, 160, 50);
		seat1_Name_Label.setLayout(null);
		seat1_Panel.add(seat1_Name_Label);

		seat1_Price_Label = new JLabel("0");
		seat1_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat1_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat1_Price_Label.setBounds(64, 174, 73, 31);
		seat1_Panel.add(seat1_Price_Label);
		////
		//// ÁÂ¼®2
		////
		seat2_Panel = new JPanel();
		seat2_Panel.setBounds(226, 55, 160, 215);
		seat2_Panel.setLayout(null);
		seat2_Panel.setOpaque(false);

		seat2_Name_Label = new JLabel("No.2");
		seat2_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat2_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat2_Name_Label.setBounds(0, 0, 160, 50);
		seat2_Name_Label.setLayout(null);
		seat2_Panel.add(seat2_Name_Label);

		seat2_Price_Label = new JLabel("0");
		seat2_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat2_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat2_Price_Label.setBounds(64, 174, 73, 31);
		seat2_Panel.add(seat2_Price_Label);
		////
		//// ÁÂ¼®3
		////
		seat3_Panel = new JPanel();
		seat3_Panel.setBounds(422, 55, 160, 215);
		seat3_Panel.setLayout(null);
		seat3_Panel.setOpaque(false);

		seat3_Name_Label = new JLabel("No.3");
		seat3_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat3_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat3_Name_Label.setBounds(0, 0, 160, 50);
		seat3_Name_Label.setLayout(null);
		seat3_Panel.add(seat3_Name_Label);

		seat3_Price_Label = new JLabel("0");
		seat3_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat3_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat3_Price_Label.setBounds(64, 174, 73, 31);
		seat3_Panel.add(seat3_Price_Label);
		////
		//// ÁÂ¼®4
		////
		seat4_Panel = new JPanel();
		seat4_Panel.setBounds(610, 55, 160, 215);
		seat4_Panel.setLayout(null);
		seat4_Panel.setOpaque(false);

		seat4_Name_Label = new JLabel("No.4");
		seat4_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat4_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat4_Name_Label.setBounds(0, 0, 160, 50);
		seat4_Name_Label.setLayout(null);
		seat4_Panel.add(seat4_Name_Label);

		seat4_Price_Label = new JLabel("0");
		seat4_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat4_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat4_Price_Label.setBounds(64, 174, 73, 31);
		seat4_Panel.add(seat4_Price_Label);
		////
		//// ÁÂ¼®5
		////
		seat5_Panel = new JPanel();
		seat5_Panel.setBounds(30, 322, 160, 215);
		seat5_Panel.setLayout(null);
		seat5_Panel.setOpaque(false);

		seat5_Name_Label = new JLabel("No.5");
		seat5_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat5_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat5_Name_Label.setBounds(0, 0, 160, 50);
		seat5_Name_Label.setLayout(null);
		seat5_Panel.add(seat5_Name_Label);

		seat5_Price_Label = new JLabel("0");
		seat5_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat5_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat5_Price_Label.setBounds(64, 174, 73, 31);
		seat5_Panel.add(seat5_Price_Label);
		////
		//// ÁÂ¼®6
		////
		seat6_Panel = new JPanel();
		seat6_Panel.setBounds(226, 322, 160, 215);
		seat6_Panel.setLayout(null);
		seat6_Panel.setOpaque(false);

		seat6_Name_Label = new JLabel("No.6");
		seat6_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat6_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat6_Name_Label.setBounds(0, 0, 160, 50);
		seat6_Name_Label.setLayout(null);
		seat6_Panel.add(seat6_Name_Label);

		seat6_Price_Label = new JLabel("0");
		seat6_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat6_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat6_Price_Label.setBounds(64, 174, 73, 31);
		seat6_Panel.add(seat6_Price_Label);
		////
		//// ÁÂ¼®7
		////
		seat7_Panel = new JPanel();
		seat7_Panel.setBounds(422, 322, 160, 215);
		seat7_Panel.setLayout(null);
		seat7_Panel.setOpaque(false);

		seat7_Name_Label = new JLabel("No.7");
		seat7_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat7_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat7_Name_Label.setBounds(0, 0, 160, 50);
		seat7_Name_Label.setLayout(null);
		seat7_Panel.add(seat7_Name_Label);

		seat7_Price_Label = new JLabel("0");
		seat7_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat7_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat7_Price_Label.setBounds(64, 174, 73, 31);
		seat7_Panel.add(seat7_Price_Label);
		////
		//// ÁÂ¼®8
		////
		seat8_Panel = new JPanel();
		seat8_Panel.setBounds(610, 322, 160, 215);
		seat8_Panel.setLayout(null);
		seat8_Panel.setOpaque(false);

		seat8_Name_Label = new JLabel("No.8");
		seat8_Name_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 18));
		seat8_Name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		seat8_Name_Label.setBounds(0, 0, 160, 50);
		seat8_Name_Label.setLayout(null);
		seat8_Panel.add(seat8_Name_Label);

		seat8_Price_Label = new JLabel("0");
		seat8_Price_Label.setFont(new Font("³ª´®°íµñ", Font.BOLD, 24));
		seat8_Price_Label.setHorizontalAlignment(SwingConstants.RIGHT);
		seat8_Price_Label.setBounds(64, 174, 73, 31);
		seat8_Panel.add(seat8_Price_Label);
		////
		//// ÀüÃ¼ÁÂ¼®¶óº§¿¡´Ù °¢ÁÂ¼® ÆÐ³Î Ãß°¡
		////
		seatAll_Label.add(seat1_Panel);
		seatAll_Label.add(seat2_Panel);
		seatAll_Label.add(seat3_Panel);
		seatAll_Label.add(seat4_Panel);
		seatAll_Label.add(seat5_Panel);
		seatAll_Label.add(seat6_Panel);
		seatAll_Label.add(seat7_Panel);
		seatAll_Label.add(seat8_Panel);
		
	}

}
