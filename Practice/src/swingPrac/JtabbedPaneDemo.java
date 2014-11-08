package swingPrac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JtabbedPaneDemo extends JPanel {

	public JtabbedPaneDemo(){
		super(new GridLayout(1, 1));
		JTabbedPane tab = new JTabbedPane();
		
		JPanel panel1 = new JPanel();
		JButton but1 = new JButton("first tab");
//
		panel1.setPreferredSize(new Dimension(400,400));
		JPanel inner_panel = new JPanel();
		inner_panel.add(but1);	
		JLabel label = new JLabel("testing panel");
		label.setLocation(0, 150);
		inner_panel.add(label);

		inner_panel.setPreferredSize(new Dimension(200, 200));
		inner_panel.setVisible(true);
		inner_panel.setBackground(Color.yellow);
		panel1.setLocation(150,50);
		panel1.add(inner_panel);
		
		tab.addTab("Tab 1", panel1);
		
		JPanel panel2 = new JPanel();
		JButton but2 = new JButton("second tab");
		panel2.add(but2);
		panel2.setPreferredSize(new Dimension(400,400));
		tab.addTab("Tab 2", panel2);
		
		JPanel panel3 = new JPanel();
		JButton but3 = new JButton("third tab");
		panel3.add(but3);
		panel3.setPreferredSize(new Dimension(400,400));
		tab.addTab("Tab 3", panel3);
		
		JPanel panel4 = new JPanel();
		JButton but4 = new JButton("fourth tab");
		panel4.add(but4);
		panel4.setPreferredSize(new Dimension(400,400));
		tab.addTab("Tab 4", panel4);
		
		add(tab);
		tab.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
	}
	
	public static void createAndShowGui(){
		JFrame frame = new JFrame("TabbedPaneDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new JtabbedPaneDemo(),BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createAndShowGui();
	}
	
	
	
	
	
}
