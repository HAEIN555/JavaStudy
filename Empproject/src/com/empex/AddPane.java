package com.empex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;


public class AddPane extends JPanel implements ActionListener,ItemListener{

	// 화면관련 멤버 필드 정의
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new  JLabel[5];
	private JTextField tf[] = new JTextField[5];
	
	private JButton okb;
	private JButton rsb;
	
	private int department = 10;
	//제목
	String [] caption = {"이름 : ","직책 : ","메일 : ","부서 : "};
	
	public AddPane() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(6,1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);
		
		int size =caption.length;
		//입력 받을 항목의 개수
		// 텍스트 필드와 라벨을 패널에 묶어서 addPane()에 추가
		int i;
		for(i=0;i<size-1;i++) {
			jp[i] = new JPanel();
			jl[i]= new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
		}
			jp[i]= new JPanel();
			jl[i]= new JLabel(caption[i]);
			jp[i].add(jl[i]);
			add(jp[i]);
			
			JComboBox combo = new JComboBox();
			combo.addItem("부서번호를 선택하세요");
			for(int c = 1;c<=5;c++) {
				combo.addItem(c*10);
			}
				jp[i].add(combo);
				combo.addItemListener(this);
				jp[size]= new JPanel();
				okb = new JButton("저장하기");
				okb.addActionListener(this);
				rsb = new JButton("다시 쓰기");
				rsb.addActionListener(this);
				jp[size].add(okb);
				jp[size].add(rsb);
				add(jp[size]);
			
			
	}
	/*itemStateChanged(Item Event e)
	 * -combox 내용선택할때 사용
	 * 
	 */
	
	@Override
	public void itemStateChanged(ItemEvent ie) {
		// TODO Auto-generated method stub
		if(ie.getStateChange()==ItemEvent.SELECTED)
			department= Integer.parseInt(ie.getItem().toString());
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		// 저장하기 버튼을 누르면 텍스트 필드의 내용을 데이터베이스에 저장함
		// 다시쓰기 버튼을 누르면 텍스트 필드를 초기화 함
		String ae_type = ae.getActionCommand();
		//명령이 어떤건지 가져오는거
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		
		if(ae_type.equals(okb.getText())) {
			
			try {
				evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText(), department, tf[2].getText());
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(evo);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("e:["+e+"]");
			}
		
			if(edvo != null) {
				JOptionPane.showMessageDialog(this, tf[0].getText()+"님이 성공적으로 추가되었습니다.");
			}
			
		}else if(ae_type.equals(rsb.getText())){
			int size = caption.length;
			for(int i=0;i<size-1;i++) {
				tf[i].setText("");
			}
		}
	}

	
	
}
