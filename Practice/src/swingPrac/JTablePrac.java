package swingPrac;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTablePrac {

	public static void main(String[] args) {
		
	
	JFrame jFrame = new JFrame();
	String[][] data={ {"101","Amit","670000"},  
            {"102","Jai","780000"},  
            {"101","Sachin","700000"}};  
String column[]={"ID","NAME","SALARY"};  

	JTable jt = new JTable(data,column);
	jt.setBounds(100, 150, 100, 200);
	JScrollPane jspane = new JScrollPane(jt);
	jFrame.add(jspane);
	jFrame.setSize(300, 400);
	jFrame.setVisible(true);
	
}
}