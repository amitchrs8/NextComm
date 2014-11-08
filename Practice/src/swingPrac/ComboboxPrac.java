package swingPrac;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboboxPrac {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("ComboBox");
		String[] area = {"first","second","third","fourht"};
		JComboBox jBox = new JComboBox(area);
		jBox.setEnabled(true);
		jBox.setBounds(100, 200, 90, 20);
		jframe.add(jBox);
		jframe.setLayout(null);
		jframe.setSize(300,400);
		jframe.setVisible(true);
	
	}
	
	
}
