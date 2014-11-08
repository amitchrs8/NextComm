package swingPrac;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class GridLayoutPrac {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JButton b1=new JButton("1");  
	    JButton b2=new JButton("2");  
	    JButton b3=new JButton("3");  
	    JButton b4=new JButton("4");  
	    JButton b5=new JButton("5");  
	    JButton b6=new JButton("6");  
	    JButton b7=new JButton("7");  
	    JButton b8=new JButton("8");  
	    JButton b9=new JButton("9");  
	    jframe.add(b1);
	    jframe.add(b2);
	    jframe.add(b3);
	    jframe.add(b4);
	    jframe.add(b5);  
	    jframe.add(b6);
	    jframe.add(b7);
	    jframe.add(b8);
	    jframe.add(b9);
	    jframe.setLayout(new FlowLayout());
	    jframe.setSize(300,300);
	    jframe.setVisible(true);
	}
	
	
	
}
