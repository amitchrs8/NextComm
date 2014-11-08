package swingPrac;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JbuttonPrac1 {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("Testing button");
		JButton jButton = new JButton("Submit");
		jButton.setBounds(130, 100, 100, 40);
		jframe.add(jButton);
		jframe.setSize(300, 400);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	}
}
