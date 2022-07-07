package com.swingex;
import java.awt.*;
import javax.swing. JComboBox;
import javax.swing.JFrame;

public class JComboxEx  extends JFrame{
	
	public JComboxEx() {

		super("JCombox Test");

		setLayout(new FlowLayout());

		String[] citems = { "One", "Two", "Three", "Four", "Five" };

		JComboBox<String> combo = new JComboBox<>(citems);
		add(combo);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 200, 300, 100);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JComboxEx();
	}

}
