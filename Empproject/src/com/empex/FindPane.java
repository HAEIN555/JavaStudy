package com.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FindPane extends JPanel implements ActionListener {

	// 화면관련 멤버 필드 정의
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];

	private JButton okb;
	private JButton rsb;

	// 제목
	String[] caption = { "번호 :", "이름 : ", "직책 : ", "부서 : ", "메일 :" };

	public FindPane() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		// 입력 받을 항목의 개수

		// 텍스트 필드와 라벨을 패널에 묶어서 addPane()에 추가
		int i;
		for (i = 0; i < size; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);

			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);

			tf[i].setEditable(false);
			// 텍스트 필드를 입력불가능한 상태로 만듦
			if (i == 0 || i == 1)
				tf[i].setEditable(true);
			// 사번과 이름으로 검색해야함으로 입력 가능한 상태로 만듦
		}
		jp[size] = new JPanel();

		okb = new JButton("사원정보조회");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);

		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String ae_type = ae.getActionCommand();
		// 이벤트가 발생한 버튼의 캡션값을 얻어온다!
		EmployeeVO evo = null;
		// 검색한 사원정보를 저장한 VO객체
		EmployeeDAO edvo = null;
		// 데이터 베이스 처리를 위한 DAO객체
		if (ae_type.equals(okb.getText())) {// 조회버튼을 누를경우

			try {
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();

				if (!sno.equals("") && !sname.equals("")) {// 사번하고 이름으로 검색
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				} else if (!sno.equals("") && sname.equals("")) {// 사번만 검색
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				} else if (sno.equals("") && !sname.equals("")) {// 이름으로 검색
					evo = edvo.getEmployeeName(sname);
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("e:[" + e + "]");
			}
			if (evo != null) {// 해당하는 사원이 존재하지 않는다면 필드 초기화
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobGrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail());

			}
			else {
				JOptionPane.showMessageDialog(this, "검색실패..!");
			}

			} else if(ae_type.equals(rsb.getText())) {// 다시쓰기 버튼을 누를 경우
				int size = caption.length;
				for (int i = 0; i < size; i++) {
				tf[i].setText("");
			}
		}

	}

}
