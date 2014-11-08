package swingPracTable;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class GroupableHeaderExample extends JFrame {

	  GroupableHeaderExample() {
	    super( "Groupable Header Example" );

	    DefaultTableModel dm = new DefaultTableModel();
	    dm.setDataVector(new Object[][]{
	      {"119","foo","bar","ja","ko","zh"},
	      {"911","bar","foo","en","fr","pt"}},
	    new Object[]{"firstColumn","SNo.","1","2","Native","2","3"});
	    
	    JTable table = new JTable( dm ) {
	      protected JTableHeader createDefaultTableHeader() {
	          return new GroupableTableHeader(columnModel);
	      }
	    };
	    table.setRowHeight(30);
	    
	    TableColumnModel cm = table.getColumnModel();
	    ColumnGroup g_name = new ColumnGroup("Name");
	    g_name.add(cm.getColumn(1));
	    g_name.add(cm.getColumn(2));
	    ColumnGroup g_lang = new ColumnGroup("Language");
	    g_lang.add(cm.getColumn(3));
	    g_lang.add(cm.getColumn(4));
	    ColumnGroup g_other = new ColumnGroup("Others");
	    g_other.add(cm.getColumn(5));
	    g_other.add(cm.getColumn(6));
	    GroupableTableHeader header = (GroupableTableHeader)table.getTableHeader();
	    header.addColumnGroup(g_name);
	    header.addColumnGroup(g_lang);
	    header.addColumnGroup(g_other);
	    JScrollPane scroll = new JScrollPane( table );
	    getContentPane().add( scroll );
	    setSize( 600, 140 );   
	  }

	  public static void main(String[] args) {
	    GroupableHeaderExample frame = new GroupableHeaderExample();
	    frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
	    frame.setVisible(true);
	  }
	}
