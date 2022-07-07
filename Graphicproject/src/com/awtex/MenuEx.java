package com.awtex;
import java.awt.*;
public class MenuEx extends Frame{

	
		// TODO Auto-generated method stub
		// 파일, 도구, 보기, 도움말
		// 라벨
		// 버튼 버튼

		private MenuBar mb = new MenuBar();

		private Menu file = new Menu("파일");
		private Menu edit = new Menu("도구");
		private Menu view = new Menu("보기");
		private Menu help = new Menu("도움말");

		// 파일 > 하위 메뉴들
		private MenuItem fnew = new MenuItem("새파일");
		private MenuItem fopen = new MenuItem("파일 열기");
		private MenuItem fsave = new MenuItem("파일 저장");
		private MenuItem fsaveAs = new MenuItem("다른 이름으로 저장하기");
		private MenuItem fexit = new MenuItem("나가기");

		// 도구 > 색상
		private Menu ecolor = new Menu("색상");
		private CheckboxMenuItem ecred = new CheckboxMenuItem("빨강");
		private CheckboxMenuItem ecgreen = new CheckboxMenuItem("초록");
		private CheckboxMenuItem ecblue = new CheckboxMenuItem("파랑");

		// 도구 > 크기
		private Menu esize = new Menu("크기");
		private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
		private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
		private CheckboxMenuItem es30 = new CheckboxMenuItem("30");

		private Label lb = new Label("수고하셨습니다...", Label.CENTER);
		private Font font = new Font("굴림체", Font.ITALIC, 10);
		private Button bt1 = new Button("확인");
		private Button bt2 = new Button("취소");

		public MenuEx() {
			super("Menu Test");

			// 큰 틀인 메뉴 생성
			setMenuBar(mb);
			mb.add(file);
			mb.add(edit);
			mb.add(view);
			mb.add(help);

			// 도구 > 색상 > 색상들 추가
			ecolor.add(ecred);
			ecolor.add(ecgreen);
			ecolor.add(ecblue);

			// 도구 > 크기 > 크기 종류 추가
			esize.add(es10);
			esize.add(es20);
			esize.add(es30);

			// 도구 > 색상, 분류해주는 선 추가, 도구 > 크기
			edit.add(ecolor);
			edit.addSeparator();
			edit.add(esize);

			// borderLayout으로 위치 찍어주기
			setLayout(new BorderLayout());
			add("North", lb); // 위쪽에 Label인데 가운데로 쓰기
			lb.setFont(font);

			add("Center", new TextArea());

			Panel p = new Panel(new GridLayout(1, 2)); // 버튼 2개 묶어주기 위해 panel 이용
			p.add(bt1);
			p.add(bt2);

			// 버튼 2개 아래로 몰았음
			add(p, BorderLayout.SOUTH);

			// 파일 > 파일 하위 메뉴들 추가
			file.add(fnew);
			file.add(fopen);
			file.add(fsave);
			file.add(fsaveAs);
			file.addSeparator();
			file.add(fexit);

			Winevent we = new Winevent();
			addWindowListener(we);

			pack();
			setVisible(true);
		}

		public static void main(String[] args) {
			new MenuEx();
	}

}
