package swingPrac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JcomboBoxPrac1 extends JPanel implements ActionListener{

	public JcomboBoxPrac1(){
	
	String [] fruits = {"Apple","Mango","Grapes","PineApple"};
	
	JComboBox comboBox = new JComboBox(fruits);
//	comboBox.setSize(400, 400);
	comboBox.setBounds(0, 0, 300, 400);
	comboBox.setSelectedIndex(2);

	comboBox.addActionListener(this);
	add(comboBox,BorderLayout.LINE_START);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JComboBox obj = (JComboBox)e.getSource();
	String choice = (String)obj.getSelectedItem();
	JOptionPane.showMessageDialog(null, choice+"  selected");
	}
	

	
	public static void createAndShowGui(){
		JFrame jframe = new JFrame("JcomboBox Practice");
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		JComponent contentPane = new JcomboBoxPrac1();
		contentPane.setOpaque(true);
		jframe.setContentPane(contentPane);
		
		jframe.pack();
		jframe.setVisible(true);
		
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
