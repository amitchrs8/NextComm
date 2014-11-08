package swingPrac;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
public class JframePrac2 {
	
	
	
	public static void createAndShowGui(){
	//	JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame jframeObj = new JFrame("FrameDemo");
		jframeObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlabel = new JLabel(new ImageIcon("C:/Users/achaura/Desktop/testImage.jpg"));
		jlabel.setPreferredSize(new Dimension(175,100));
		jframeObj.getContentPane().add(jlabel,BorderLayout.CENTER);
		
		jframeObj.setIconImage(new ImageIcon("C:/Users/achaura/Desktop/testImage.jpg").getImage());	
		jframeObj.pack();
		jframeObj.setVisible(true);

	}
	
	
	public static void main(String[] args) {
	 createAndShowGui();
		
	}

}
