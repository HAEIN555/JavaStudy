package com.swingex;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {

	int korean,english,math;
	
	// �׸��� ����ϴ� �޼ҵ�
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);
		// Y���� 250 �̰� X���� 350���� �ִ�.
		for(int cnt=1;cnt<11;cnt++) {
			g.drawString(cnt*10+"", 25, 255-20*cnt);
			// cnt*10�� 10ĭ���� �׸��� �����°�
			g.drawLine(50, 250-20*cnt, 350, 250-20*cnt);
			
			//for���� ���ư������� ������ 1���� ���ܼ� 10���� ���������?
		}
		g.drawLine(50, 20,50, 250);
		g.drawString("����", 100, 270);
		g.drawString("����", 200, 270);
		g.drawString("����", 300, 270);
		// �׷��� �׸����Ҷ� �����°�
		
		g.setColor(Color.GREEN);
		if(korean>0) {
			g.fillRect(110, 250-korean*2, 10, korean*2);
			// ���������� �׷��� ���� ������ش�. ó�� ���۰� �� �׸��� �β� ���� 
		}
		if(english>0) {
			g.fillRect(210, 250-english*2, 10, english*2);
			//���������� �׷��� ���� ������ش�. ó�� ���۰� �� �׸��� �β� ���� 
		}
		if(math>0) {
			g.fillRect(310, 250-math*2, 10, math*2);
			// ���������� �׷��� ���� ������ش�. ó�� ���۰� �� �׸��� �β� ���� 
		}
		
		}
		public void setScores(int korean,int english, int math) {
		this.korean= korean;
		this.english=english;
		this.math= math;
		
	}
	
}
