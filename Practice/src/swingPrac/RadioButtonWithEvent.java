package swingPrac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RadioButtonWithEvent extends JFrame implements ActionListener{
	JRadioButton rb1;
	JRadioButton rb2;
	RadioButtonWithEvent(){
	 rb1 = new JRadioButton("Yes");
	 rb2 = new  JRadioButton("No");
		rb1.setBounds(100, 50,100,30);
		rb2.setBounds(100, 100, 100, 30);
	
	ButtonGroup bg = new ButtonGroup();
	bg.add(rb1);
	bg.add(rb2);
	
	JButton jbutton = new  JButton("Click Now");
	jbutton.setBounds(150, 200, 200, 30);
		jbutton.addActionListener(this);
		add(rb1);
		add(rb2);
		add(jbutton);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(rb1.isSelected()){
			JOptionPane.showMessageDialog(this,"you selected \"Yes\"");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "You selected \"NO\"");
		}
		}



	public static void main(String[] args) {
		new RadioButtonWithEvent();
	}




}