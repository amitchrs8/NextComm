package swingPrac;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaPrac {

public static void main(String[] args) {
	JFrame jframe = new JFrame();
	JTextArea jText = new JTextArea();
	jText.setBounds(10,30,300,300);
	jText.setBackground(Color.white);
	jText.setForeground(Color.red);
	
	jframe.add(jText);
	jframe.setSize(300,300);
	jframe.setLayout(null);
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
