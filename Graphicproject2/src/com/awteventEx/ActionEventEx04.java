package com.awteventEx;
import java.awt.*;
import java.awt.event.*;
import com.awtex.Winevent;
public class ActionEventEx04 extends Frame implements ActionListener{
	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = 
		{Color.red,Color.green,Color.blue,Color.yellow};

	private CardLayout card = new CardLayout();
	private Panel pptop;
	
	public ActionEventEx04() {
		// TODO Auto-generated constructor stub
		super("ActionEvent4");
		
		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1,4));
		for(int i =0;i<bt.length;i++) {
			bt[i]= new Button(i+1+"¹ø ¹öÆ°");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		add("North",p);
		
		pptop = new Panel(card);
		for(int i =0;i<pp.length;i++) {
			pp[i]= new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add(""+i,pp[i]);
		}
		
		add("Center",pptop);
		
		card.show(pptop,"0");
		
		
		Winevent we = new Winevent();
		addWindowListener(we);
		setSize(300,200);
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventEx04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			if(e.getSource()==bt[i]) {
				card.show(pptop, ""+i);
			}
		}
	}

}
