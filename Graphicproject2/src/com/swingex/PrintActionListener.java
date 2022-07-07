package com.swingex;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
public class PrintActionListener implements ActionListener {

	JTable table;
	
	public PrintActionListener(JTable table) {
		// TODO Auto-generated constructor stub
		this.table= table;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// 테이블 패키지에서 지원
		TableModel model = table.getModel();
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		// 행과 열의 갯수를 가져온다.?????
		for(int col=0;col<colNum;col++) {
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		System.out.println();
		for(int row=0;row<rowNum;row++) {
			for(int col=0;col<colNum;col++) {
				Object obj = model.getValueAt(row, col);
				System.out.print(obj+"\t");
			}
			System.out.println();
		}
	}

}
