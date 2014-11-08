package swingPrac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class ManuPrac {
	
	private static void createAndShowGui(){
		JFrame jFrame = new JFrame("TopLevelFrame");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar jMenuBar= new JMenuBar();
		jMenuBar.setOpaque(true);
		jMenuBar.setBackground(new Color(154, 165, 127));
		jMenuBar.setPreferredSize(new Dimension(200, 20));
		
		JLabel jLabel = new   JLabel();
		jLabel.setOpaque(true);
		jLabel.setBackground(new Color(248, 213, 131));
		jLabel.setPreferredSize(new Dimension(200, 180));
		
		jFrame.setJMenuBar(jMenuBar);
		jFrame.getContentPane().add(jLabel,BorderLayout.CENTER);
		
		jFrame.pack();
		jFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("Calling the createAndShowGui() method");
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createAndShowGui();
	}

}
