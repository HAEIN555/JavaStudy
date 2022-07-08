package com.multi;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MultiChatClient implements Runnable, ActionListener {

	private String ip;
	private String id;
	private Socket socket;
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	//로그인 패널
	private JPanel loginPanel;
	//로그인 버튼
	private JButton loginButton;
	//대화명 
	private JLabel label1;
	// 대화명 입력 텍스트 필드
	private JTextField idInput;
	//로그아웃 패널
	private JPanel logoutPanel;
	//로그아웃 버튼
	private JButton logoutButton;
	//대화명 
	private JLabel label2;
	// 입력패널 구성
	private JPanel msgPanel;
	//입력 텍스트 필드
	private JTextField msgInput;
	// 종료버튼
	private JButton exitButton;
	//메인 윈도우 창
	private JFrame jframe;
	// 채팅내용 출력할 창
	private JTextArea msgOut;
	// 카드 레이아웃
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	// 상태 플래그
	boolean status;
	
	
	
	public MultiChatClient(String ip) {
		// TODO Auto-generated constructor stub
		this.ip = ip;
		// 로그인 패널 구성
		loginPanel = new JPanel();
		// 레이아웃 설정
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
