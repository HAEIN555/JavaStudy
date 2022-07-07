package com.swingex;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class AddActionListener implements ActionListener {

	JTable table;
	JTextField text1, text2,text3;
	
	public AddActionListener(JTable table,JTextField text1,JTextField text2,JTextField text3) {
		// TODO Auto-generated constructor stub
		this.table = table;
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String[] arr = new String[3];
		arr[0]= text1.getText();
		arr[1]= text2.getText();
		arr[2]= text3.getText();
	
	DefaultTableModel model = (DefaultTableModel)table.getModel();
	model.addRow(arr);
	}

}
