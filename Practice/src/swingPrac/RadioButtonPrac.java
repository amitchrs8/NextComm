package swingPrac;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonPrac {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JRadioButton but1 = new JRadioButton("YES");
		JRadioButton but2 = new JRadioButton("NO");
		JRadioButton but3 = new JRadioButton("Not Sure");
		but1.setBounds(50, 100, 70, 30);
		but2.setBounds(50, 150, 70, 30);
		but3.setBounds(50,200,170,30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(but1);
		bg.add(but2);
		bg.add(but3);
		jframe.add(but1);
		jframe.add(but2);
		jframe.add(but3);
		jframe.setSize(300, 300);
		jframe.setLayout(null);
		jframe.setVisible(true);
		
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		
	}
	
}
