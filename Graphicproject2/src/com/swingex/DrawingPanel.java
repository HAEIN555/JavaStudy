package com.swingex;

import java.awt.*;
import javax.swing.*;

public class DrawingPanel extends JPanel {

	int korean,english,math;
	
	// 그릴때 사용하는 메소드
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);
		// Y축이 250 이고 X축은 350까지 있다.
		for(int cnt=1;cnt<11;cnt++) {
			g.drawString(cnt*10+"", 25, 255-20*cnt);
			// cnt*10은 10칸마다 그릴때 나오는거
			g.drawLine(50, 250-20*cnt, 350, 250-20*cnt);
			
			//for문이 돌아갈때마다 가로줄 1개씩 생겨서 10개가 만들어진다?
		}
		g.drawLine(50, 20,50, 250);
		g.drawString("국어", 100, 270);
		g.drawString("영어", 200, 270);
		g.drawString("수학", 300, 270);
		// 그래프 그리기할때 나오는거
		
		g.setColor(Color.GREEN);
		if(korean>0) {
			g.fillRect(110, 250-korean*2, 10, korean*2);
			// 국어점수의 그래프 폭을 만들어준다. 처음 시작과 끝 그리고 두께 높이 
		}
		if(english>0) {
			g.fillRect(210, 250-english*2, 10, english*2);
			//영어점수의 그래프 폭을 만들어준다. 처음 시작과 끝 그리고 두께 높이 
		}
		if(math>0) {
			g.fillRect(310, 250-math*2, 10, math*2);
			// 수학점수의 그래프 폭을 만들어준다. 처음 시작과 끝 그리고 두께 높이 
		}
		
		}
		public void setScores(int korean,int english, int math) {
		this.korean= korean;
		this.english=english;
		this.math= math;
		
	}
	
}
