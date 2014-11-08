package swingPrac;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JframePrac {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame("JframeTesting");
		JButton button = new JButton("Click");
		button.setBounds(130,100,100,40);
		jFrame.add(button);
		jFrame.setSize(400, 500);
		jFrame.setLayout(null);
		jFrame.setVisible(true);
		
		
	}
	
	
	
}


