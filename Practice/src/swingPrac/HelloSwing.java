package swingPrac;

import javax.swing.JLabel;
import javax.swing.*;

public class HelloSwing {

	public static void main(String[] args) {
		
		JFrame jframe = new JFrame("HelloWorldSwing");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel jlabelText = new JLabel("Hello Swing");
		jframe.getContentPane().add(jlabelText);
		jframe.pack();
		
		jframe.setVisible(true);
		jframe.setSize(200, 300);

	}
	
	
}
