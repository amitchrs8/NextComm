package swingPrac;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JbuttonPrac2 extends JPanel implements ActionListener {
	
	//Adding button 
	JButton b1,b2,b3;
	
	public JbuttonPrac2() {
		b1 = new JButton("Disable Middle Button");
		b2 = new JButton("Enable Middle Button");
		b3 = new JButton("Middle Button");
		
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setOpaque(true);
		b1.setHorizontalTextPosition(AbstractButton.LEFT);
		b1.setActionCommand("disable");
		
		b2.setVerticalTextPosition(AbstractButton.CENTER);
		b2.setHorizontalTextPosition(AbstractButton.RIGHT);
		b2.setActionCommand("enable");
		
		b3.setVerticalTextPosition(AbstractButton.CENTER);
		b3.setHorizontalTextPosition(AbstractButton.CENTER);
		
		//Adding Actionlistener so that an action can be performed when the buttons are clicked
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		b1.setToolTipText("Click the button to disable the middle button");
		b2.setToolTipText("Click this button to enable the middle button");
		b3.setToolTipText("This button does nothig when being clicked");
		
		//Putting initial state of buttons
		b1.setEnabled(true);
		b2.setEnabled(false);
		b3.setEnabled(true);

		//Adding mnemonic to buttons, this is used as Keyborad shortcut to click the buttons
		b1.setMnemonic(KeyEvent.VK_D);
		b2.setMnemonic(KeyEvent.VK_E);

		//Adding these components to container using default flowlayout
		add(b1);
		add(b3);
		add(b2);

	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		if("disable".equals(ae.getActionCommand())){
			b1.setEnabled(false);
			b2.setEnabled(true);
			b3.setEnabled(false);
		}
		else{
			b1.setEnabled(true);
			b2.setEnabled(false);
			b3.setEnabled(true);
		}
		
	}
	
	public static void createAndShowGui(){
		JFrame jframe = new  JFrame("Top Level Frame");
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		JbuttonPrac2 jbuttonObj = new JbuttonPrac2();
		jbuttonObj.setOpaque(true);
		jframe.setContentPane(jbuttonObj);
		jframe.setVisible(true);
		jframe.pack();
		
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				createAndShowGui();
				
			}
		});
	}

}
