package swingPrac;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DesignPrac extends Canvas{

	public void paint(Graphics g){
		g.drawString("Graphics Testing", 100, 200);
		g.fillRect(130,30, 100, 80);
/*		g.drawOval(30,130,50, 60);  
        setForeground(Color.RED);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
		setBackground(Color.white);
*/	
	}
	
	
	public static void main(String[] args) {
		
		DesignPrac obj = new  DesignPrac();
		JFrame jFrame = new  JFrame("Frame Level");
		jFrame.add(obj);
	//	jFrame.setLayout(null);
		jFrame.setSize(300, 400);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
