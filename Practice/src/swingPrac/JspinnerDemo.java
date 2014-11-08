package swingPrac;

import java.awt.Container;
import java.util.Calendar;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpringLayout;

public class JspinnerDemo extends JPanel{
	
	public JspinnerDemo (){
		super();
		String [] labels={"Month", "Year","Another Date"};
		int numPairs=labels.length;
		Calendar cal = Calendar.getInstance();
		JFormattedTextField ftf=null;
		String[] monthStrings=getMonthStrings();
		SpinnerListModel monthModel=null;
		
		//Add first label-spinner pair
		monthModel= new SpinnerListModel(monthStrings);
		JSpinner spinner = addLabeledSpinner(this,labels[0],monthModel); 
		
	
	}

	
	static JSpinner addLabeledSpinner(Container c, String label, SpinnerModel model){
		JLabel jlabel = new JLabel(label);
		c.add(jlabel);
		JSpinner jSpinner = new JSpinner(model);
		jlabel.setLabelFor(jSpinner);
		c.add(jSpinner);
		return jSpinner;
		
	}
	
	static String[] getMonthStrings(){
		String months[] = new java.text.DateFormatSymbols().getMonths();
		int lastIndex = months.length-1;
		if (months[lastIndex] == null
		           || months[lastIndex].length() <= 0) { //last item empty
		            String[] monthStrings = new String[lastIndex];
		            System.arraycopy(months, 0,
		                             monthStrings, 0, lastIndex);
		            return monthStrings;
		        } else { //last item not empty
		            return months;
		        }
	}
	
	static void createAndShowGui(){
		JFrame jFrame= new JFrame("SpinnerDemo");
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
	
		jFrame.add(new JspinnerDemo());
		jFrame.pack();
		jFrame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		createAndShowGui();
	}
	
	
	
}
