package swingPrac;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JlabelPrac1 extends JPanel{

		public JlabelPrac1() {
			super(new GridLayout(3,1));
			JLabel label1,label2,label3;
			ImageIcon img = new ImageIcon("C:/Users/achaura/Desktop/testImage.jpg");
			label1 = new JLabel("Image and Text",img,JLabel.CENTER);
			label2 = new JLabel(img);
			label3 = new JLabel("Only Text");
			label1.setToolTipText("This label has text and image both");
			label2.setToolTipText("This one has image only");
			label3.setToolTipText("This label has text only");
			add(label1);
			add(label2);
			add(label3);
		}
	
		public static void createAndShowGui(){
			JFrame frame = new JFrame("Jlabel Demo");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(new JlabelPrac1());
			frame.setVisible(true);
			frame.pack();
			
		}
	
		public static void main(String[] args) {
			createAndShowGui();
		}
	
	
	
	
	
}
