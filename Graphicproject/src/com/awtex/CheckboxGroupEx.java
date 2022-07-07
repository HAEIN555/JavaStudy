package com.awtex;
import java.awt.*;
public class CheckboxGroupEx extends Frame {
	private Label lb = new Label("����� ������ ?");
	private Button bt = new Button("Ȯ��");
	CheckboxGroup cg = new CheckboxGroup();

	Checkbox man = new Checkbox("����", cg, true);
	Checkbox woman = new Checkbox("����", cg, false);

	public CheckboxGroupEx() {
		super("Checkbox Grouping");
		setLayout(new GridLayout(4, 1));

		add(lb);
		add(man);
		add(woman);
		add(bt);

		Winevent we = new Winevent();
		addWindowListener(we);
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		new CheckboxGroupEx();
	}
	

}
