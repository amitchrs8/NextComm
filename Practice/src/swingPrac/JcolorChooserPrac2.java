package swingPrac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JcolorChooserPrac2 extends JPanel implements ChangeListener{

	JColorChooser colorChooser;
	JLabel jLabel;
	
	JcolorChooserPrac2(){
		jLabel = new JLabel("Welcum ",jLabel.CENTER);
		jLabel.setBackground(Color.yellow);
		jLabel.setForeground(Color.blue);
		jLabel.setOpaque(true);
		jLabel.setPreferredSize(new Dimension(100,50));
		
		JPanel labelPanel = new JPanel(new BorderLayout());
		
		labelPanel.add(jLabel,BorderLayout.CENTER);
		labelPanel.setBorder(BorderFactory.createTitledBorder("Choose Text Color"));
		
		//Set up color chooser for the text
		colorChooser = new JColorChooser(jLabel.getForeground());
		colorChooser.getSelectionModel().addChangeListener(this);
		
		add(labelPanel,BorderLayout.CENTER);
		add(colorChooser, BorderLayout.PAGE_END);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		Color color = colorChooser.getColor();
		jLabel.setForeground(color);
	}
	
	
	


	
	
	
	
	
	
	
	
	
}
