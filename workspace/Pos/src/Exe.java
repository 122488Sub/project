import javax.swing.JFrame;


public class Exe {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Pos"); //HIGH-LOW GAME이라는 인자 값을 가진 인스턴스생성
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램을 안정적으로 종료할 수 있게 한다.
		frame.setResizable(true);//창의 크기를 변경할 수 없게 만들었다.
		
		MainPanel primary = new MainPanel();//HighLowPanel인스턴스 생성 후 초기화.
		
		frame.getContentPane().add(primary);//frame에 primary를 붙인다.
		frame.pack();
		frame.setVisible(true);//frame이 보이게 한다.
	}
}
