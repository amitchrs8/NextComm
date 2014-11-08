package swingPrac;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Thread.State;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JfileChooserPrac extends JPanel implements ActionListener{

	static private final String newline ="\n";
	JButton openButton,saveButton;
	JTextArea log;
	JFileChooser jFc;
	
	public JfileChooserPrac(){
		log = new JTextArea(5,20);
		log.setMargin(new Insets(5, 5, 5, 5));
		log.setEditable(false);
		
		JScrollPane logScrollPane = new JScrollPane(log);
		jFc = new JFileChooser();
		
		openButton = new JButton("Open File");
		saveButton = new JButton("Save File");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
	
		
	}	
	
	
	
}
