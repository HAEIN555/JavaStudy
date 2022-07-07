package com.swingex;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class RemoveActionListener implements ActionListener {
	
	
	JTable table;
	public RemoveActionListener(JTable table) {
		
	// TODO Auto-generated constructor stub
		this.table=table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 선택한 행을 가져온다.
		int row = table.getSelectedRow();
			if(row==-1){
				return;
			}
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.removeRow(row);
	}

}
