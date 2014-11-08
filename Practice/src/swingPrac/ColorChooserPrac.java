package swingPrac;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooserPrac extends JFrame implements ActionListener{

	JButton jbutton;
	Container cont;
	
	public ColorChooserPrac() {
		cont = getContentPane();
		cont.setLayout(new FlowLayout());
		jbutton= new JButton("Color");
		jbutton.addActionListener(this);
		cont.add(jbutton);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		Color initColor = Color.red;
		Color color = JColorChooser.showDialog(this,"Select a Color", initColor);
		cont.setBackground(color);
	}

	public static void main(String[] args) {
		ColorChooserPrac obj = new ColorChooserPrac();
		obj.setSize(400,400);
		
		obj.setVisible(true);
		obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
