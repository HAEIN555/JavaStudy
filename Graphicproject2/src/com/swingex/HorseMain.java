package com.swingex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class HorseMain  extends JFrame implements Runnable {

	private Canvas can;
	private Image buffer;
	private Image [] horse;
	
	private boolean bRepeat = true;
	
	
	public HorseMain() {
		// TODO Auto-generated constructor stub
		initHorse();
		
		this.add(can = new Canvas() {
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(buffer, 0, 0, this);
			}
			@Override
			public void update(Graphics g) {
				// TODO Auto-generated method stub
				paint(g);
			}
		
		});
		
		can.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			int code = e.getKeyCode();
			switch (code) {
			case KeyEvent.VK_SPACE:
				bRepeat =!bRepeat;
				if(bRepeat)
					makeThread();
				break;
					}
				}
			});
		// 기본템
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//pack();
				setBounds(300, 100, 400, 400);
				setVisible(true);
				
				makeThread();
				
				
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			for(int i=0;i<horse.length;i++) {
				if(!bRepeat) return;
				try {
					Thread.sleep(50);
				} catch (InterruptedException ex) {}
					// TODO: handle exception
				bufferpaint(i);
			}
		}
	}

	public void makeThread() {
		new Thread(this).start();
	}
	public void initHorse() {
		horse = new Image[11];
		for(int i=0;i<horse.length;i++) {
			horse[i]= Toolkit.getDefaultToolkit().getImage(String.format("src/image/black%02d.png",i+1));
			// 이미지를 불러오는 것 
		}
	}
	public void bufferpaint(int n) {
		buffer = createImage(can.getWidth(),can.getHeight());
		Graphics buffer_g = buffer.getGraphics();
		buffer_g.drawImage(horse[n], 50, 50, this);
		can.repaint();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HorseMain();
	}

}
