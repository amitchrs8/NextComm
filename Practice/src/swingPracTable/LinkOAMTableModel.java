package swingPracTable;

import javax.swing.table.AbstractTableModel;

public class LinkOAMTableModel extends AbstractTableModel{

	String columnName[] = { "Object", "Windows(sec)", "Threshold(frames)", "Windows(ms)",
			"Threshold(frames)", "Windows(sec)", "Threshold(frames)" };	
	
	@Override
	public int getColumnCount() {

		return columnName.length;
	}

	@Override
	public int getRowCount() {

		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {

		return null;
	}

	@Override
	public String getColumnName(int arg0) {
		return columnName[arg0];
	}

	
	
	
}
