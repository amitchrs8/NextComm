package swingPracTable;

import java.awt.Component;

import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class LinkOAMTable extends JTable {
	private LinkOAMTableModel model;
	
	public LinkOAMTable(LinkOAMTableModel model){
		super(model);
		this.model=model;
		init();
	}
	
	private void init(){
		
		TableColumnModel columnModel = getColumnModel();
		columnModel.getColumn(1).setCellRenderer(new SpinnerRenderer(new SpinnerNumberModel(1,1,12312,1)));
	
	}
	
	
	public static void main(String[] args) {
		new LinkOAMTable(new LinkOAMTableModel());
	}
	
}



	class SpinnerRenderer extends JSpinner implements TableCellRenderer{
		
		public  SpinnerRenderer(SpinnerNumberModel numModel) {
			super(numModel);
		}
		@Override
		public Component getTableCellRendererComponent(JTable arg0,
				Object arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
			return this;
		}
		
		
	}