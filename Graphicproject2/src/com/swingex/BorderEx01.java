package com.swingex;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx01 extends JFrame {
	private JButton[] jb = new JButton[6];

	public BorderEx01() {

		super("Border Test");

		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));

		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JButton(i + 1 + "번 버튼");
			con.add(jb[i]);
		}

		EmptyBorder eb = new EmptyBorder(10, 10, 10, 10); // 테두리 없음
		jb[0].setBorder(eb);
		LineBorder lb = new LineBorder(Color.red, 5);
		jb[1].setBorder(lb);
		EtchedBorder eeb = new EtchedBorder(); // 경계선이 파여있는 듯한 느낌
		jb[2].setBorder(eeb);
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
		jb[3].setBorder(bb);
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jb[4].setBorder(sbb);
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.yellow);
		jb[5].setBorder(mb);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new BorderEx01();

	}
}
