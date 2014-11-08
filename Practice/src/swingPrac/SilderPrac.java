package swingPrac;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SilderPrac {

	public static void main(String[] args) {
		
		JSlider jslider= new JSlider(JSlider.HORIZONTAL,0,50,25);
		JFrame jFrame = new JFrame("Testing the Slider");
		JPanel jPanel = new JPanel();
		jPanel.add(jslider);
		jslider.setMinorTickSpacing(2);  
		jslider.setMajorTickSpacing(10);  
		  
		jslider.setPaintTicks(true);  
		jslider.setPaintLabels(true);
		jFrame.add(jPanel);
		jFrame.pack();
		jFrame.setLayout(null);
		jFrame.setVisible(true);	
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
