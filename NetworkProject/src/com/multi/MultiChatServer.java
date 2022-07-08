package com.multi;
import java.io.*;
import java.net.*;
import java.util.*;//array list쓰려구
public class MultiChatServer {

	private ServerSocket ss = null;
	private Socket s  = null;
	
	// 연결된 클라이언트 스레드를 관리하는 arraylist
	ArrayList<ChatThread>chatlist = new ArrayList<ChatThread>();
	//multi 채팅의 메인 프로그램
	public void start() {
		
		try {
			// 서버소켓 생성
			ss= new ServerSocket(4000);
			System.out.println("Server start");
			// 무한 루프를 돌면서 클라이언트 접속을 기다린다.
			while(true) {
				s= ss.accept();
				//연결된 클라이언트 에서 스레드 생성
				ChatThread chat = new ChatThread();
				//클라이 언트 리스프에 스레드 추가
				chatlist.add(chat);
				// 스레드 시작
				chat.start();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("[MultiChatServer]start() Exception이 발생했습니다.");
		}
	}
	// 각 클라이언트 관리를 위한 스레드 클래스 구현
	class ChatThread extends Thread{
		
		// 수신 메세지와 파싱 메세지 처리 하는 변수 선언
		String msg;
		String[] rmsg;
		//입출력 스트림생성
		private BufferedReader inMsg = null;
		private PrintWriter outMsg = null;
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			boolean status= true;
			System.out.println("##Chat Thread start");
			try {
				inMsg = new BufferedReader(new InputStreamReader(s.getInputStream()));
				outMsg = new PrintWriter(s.getOutputStream(),true);// 자동으로 지워닌다.
						// 상태정보가 true라면  루프를 돌면서 사용자 한테서 수신된 메세지 처리함
						while(status) {
							// 수신된 메세지를 msg변수에 저장함
							msg= inMsg.readLine();
							// '/'로 구분자를 기준으로 메세지 문자열 배열로 파싱함
							rmsg = msg.split("/");
							
							//파싱된 문자열 배열의 두번째 요소 값에 따라 처리
							
							//로그 인메세지일때 
							if(rmsg[1].equals("login")) {
								msgSendAll("server/"+rmsg[0]+"님이 로그인 했습니다.");
							}
							// 로그 아웃메세지일때
							else if(rmsg[1].equals("logout")) {
								chatlist.remove(this);
								msgSendAll("server/"+rmsg[0]+"님이 종료 했습니다.");
								// 해당 클라이언트 스레드 종료로 인해 status를 false로 설정
								status = false;
							}
							// 그밖의 메세지 일때 
							else {
								msgSendAll(msg);
							}
						}
						//루프를 벗어나면 클라이언트 연결이 종료 됨으로 스레드의 인터럽트가 발생
						this.interrupt();
						System.out.println("##"+this.getName()+"stop!!!!!!!!!");
				
						} catch (IOException ii) {
							// TODO: handle exception
							chatlist.remove(this);
							System.out.println("[ChatThread] run() IOException발생");
						}
				}
		}
					// 연결된 모든 클라이언트에게 메세지를 전달 하는 기능 구현
				public void msgSendAll(String msg) {
					for(ChatThread ct : chatlist) {
						ct.outMsg.println(msg);
					}
				}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		MultiChatServer ser = new MultiChatServer();
		ser.start();
	}

}
