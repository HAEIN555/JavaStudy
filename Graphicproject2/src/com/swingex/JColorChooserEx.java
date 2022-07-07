package com.swingex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooserEx extends JFrame implements ActionListener {
	JMenuBar mb = new JMenuBar();
	JMenu mnuSelect = new JMenu("선택");
	JMenuItem mnuColor = new JMenuItem("색상");

	JLabel l = new JLabel("출력창");
	JTextArea ta = new JTextArea();

	public JColorChooserEx() {

		super("JColorChooser Test");

		mnuSelect.add(mnuColor);
		setJMenuBar(mb);
		mb.add(mnuSelect);
		add("North", l);
		add("Center", ta);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 300, 200);
		setVisible(true);

		mnuColor.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mnuColor) {
			JColorChooser chooser = new JColorChooser();
			Color col = chooser.showDialog(this, "색상을 고르세요", Color.blue);
			l.setText("선택한 색상은 " + col);
			ta.setBackground(col);
		}
	}

	public static void main(String[] args) {
		new JColorChooserEx();
	}
	

}
