package swingPrac;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JCheckBoxPrac extends JPanel implements ItemListener{
	
	JCheckBox first;
	JCheckBox second;
	JCheckBox third;
	JCheckBox fourth;
	
	JCheckBoxPrac(){
		//Initialising all CheckBox objects
		first = new JCheckBox("First");
		second = new JCheckBox("Second");
		third = new JCheckBox("Third");
		fourth = new JCheckBox("Fourth");
		
		//Making all Checkbox's initial state as selected
//		first.setSelected(true);
//		second.setSelected(true);
//		third.setSelected(true);
		fourth.setSelected(true);
		first.setEnabled(false);
		
		//Adding Itemlistener to the buttons so that callback method can be invoked when buttons are selected/deselected
		
		first.addItemListener(this);
		second.addItemListener(this);
		third.addItemListener(this);
		fourth.addItemListener(this);
		
		//Putting all checkboxes in a panel
		JPanel checkBoxPanel = new JPanel(new GridLayout(0,1));
		checkBoxPanel.add(first);
		checkBoxPanel.add(second);
		checkBoxPanel.add(third);
		checkBoxPanel.add(fourth);
		add(checkBoxPanel, BorderLayout.CENTER);
		
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object choice = e.getItemSelectable();
		if(choice == first){
			choice = "First";
		}
		else if (choice == second) {
			choice = "Second";
		}
		else if (choice == third) {
			choice = "Third";
		}
		else {
			choice = "Fourth";
		}
		if(e.getStateChange() == ItemEvent.DESELECTED){
			JOptionPane.showMessageDialog(null, choice+"  has been deselected!");
		}
		else {
			JOptionPane.showMessageDialog(null, choice+"  has been selected...");
		}
	}
	
	public static void createAndShowGui(){
		JFrame jframe = new JFrame("JCheckBox Practice");
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		JComponent contentPane = new JCheckBoxPrac();
		contentPane.setOpaque(true);
		jframe.setContentPane(contentPane);
		//display the window
		jframe.pack();
		jframe.setVisible(true);
		jframe.setEnabled(false);
	}
	
	
	
	public static void main(String[] args) {

	javax.swing.SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {

			createAndShowGui();
		}
	});
	}
	
	
	
	
	
	

}
