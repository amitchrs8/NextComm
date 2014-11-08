package swingPrac;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutPrac {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("South");
		
		frame.add(b1, BorderLayout.NORTH);
		frame.add(b2,BorderLayout.SOUTH);
		frame.setSize(400,400);
		frame.setVisible(true);
		
		
	}
	
	
	
}
