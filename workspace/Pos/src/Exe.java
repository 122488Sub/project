import javax.swing.JFrame;


public class Exe {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Pos"); //HIGH-LOW GAME�̶�� ���� ���� ���� �ν��Ͻ�����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���α׷��� ���������� ������ �� �ְ� �Ѵ�.
		frame.setResizable(true);//â�� ũ�⸦ ������ �� ���� �������.
		
		MainPanel primary = new MainPanel();//HighLowPanel�ν��Ͻ� ���� �� �ʱ�ȭ.
		
		frame.getContentPane().add(primary);//frame�� primary�� ���δ�.
		frame.pack();
		frame.setVisible(true);//frame�� ���̰� �Ѵ�.
	}
}
