package swingPrac;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class InternalFrameDemo extends JFrame implements ActionListener{
	
		JDesktopPane desktopPane;
		
		public InternalFrameDemo(){
			super("InternalFrameDemo");
			int inset=50;
			Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			setBounds(inset, inset, screensize.width-inset*2, screensize.height-inset*2);
			desktopPane = new JDesktopPane();
			createFrame();
			setContentPane(desktopPane);
			setJMenuBar(createMenuBar());
			desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
		}
	
		protected JMenuBar createMenuBar() {
			JMenuBar menuBar = new JMenuBar();
			JMenu menu = new JMenu("Document");
			menu.setMnemonic(KeyEvent.VK_D);
			menuBar.add(menu);
			JMenuItem menuItem = new JMenuItem("New");
			menuItem.setMnemonic(KeyEvent.VK_N);
			menuItem.setAccelerator(KeyStroke.getKeyStroke(
	                KeyEvent.VK_N, ActionEvent.ALT_MASK));
			menuItem.setActionCommand("new");
			menuItem.addActionListener(this);
			menu.add(menuItem);
			
			menuItem = new JMenuItem("Quit");
			menuItem.setMnemonic(KeyEvent.VK_Q);
			menuItem.setAccelerator(KeyStroke.getKeyStroke(
	                KeyEvent.VK_Q, ActionEvent.ALT_MASK));
			menuItem.setActionCommand("quit");
			menuItem.addActionListener(this);
			menu.add(menuItem);
			
			return menuBar;
		}
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			if("new".equals(ae.getActionCommand())){
				createFrame();
			}
			else{
				quit();
			}
		}

		protected void createFrame(){
			MyInternalFrame frame = new MyInternalFrame();
			frame.setVisible(true);
			desktopPane.add(frame);
			try {
				frame.setSelected(true);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		protected void quit(){
			System.exit(0);
		}
		
		public static void createAndShowGui(){
			JFrame.setDefaultLookAndFeelDecorated(true);
			InternalFrameDemo obj = new InternalFrameDemo();
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			obj.setVisible(true);
		}
		
		public static void main(String[] args) {
			createAndShowGui();
		}
}
