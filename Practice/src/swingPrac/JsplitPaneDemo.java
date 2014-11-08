package swingPrac;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JsplitPaneDemo extends JPanel implements ListSelectionListener{

	private JSplitPane splitPane;
	private JLabel picture;
	private String [] birds={"crow", "sparrrow", "parrot","peacock"};
	private JList list;
	public JsplitPaneDemo(){
		list = new JList(birds);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		
		JScrollPane listScrollPane = new JScrollPane(list);
		picture = new JLabel();
		picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
		picture.setHorizontalAlignment(JLabel.CENTER);
		
		JScrollPane pictureScrollPane = new JScrollPane(picture);
		
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,listScrollPane,pictureScrollPane);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(150);
		
		Dimension minsize = new Dimension(100, 50);
		listScrollPane.setMinimumSize(minsize);
		pictureScrollPane.setMinimumSize(minsize);
		
		splitPane.setPreferredSize(new Dimension(400,200));
		updateLabel(birds[list.getSelectedIndex()]);
	}
	
	
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		
		JList list = (JList)lse.getSource();
		updateLabel(birds[list.getSelectedIndex()]);
	}
	
	void updateLabel(String birdName){
		picture.setText("The selected bird is "+birdName.toUpperCase());
	}

    public JSplitPane getSplitPane() {
        return splitPane;
    }
	
	
	public static void createAndShowGui(){
		JFrame jFrame = new JFrame("SplitPaneDemo");
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		JsplitPaneDemo obj = new JsplitPaneDemo();
		jFrame.getContentPane().add(obj.getSplitPane());
		jFrame.pack();
		jFrame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		createAndShowGui();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
