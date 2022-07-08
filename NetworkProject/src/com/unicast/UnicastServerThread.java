package com.unicast;
import java.io.*;
import java.net.*;
	// 클라이언트와 연결된 소켓 객체를 가지고 있으며, 접속을 유지하고 통신을 담당하는 클래스 이다!
	// 먼저 만드는건 
public class UnicastServerThread extends Thread{
	// 서버로 부터 전달된 socket을 저장합니다.
	Socket socket = null;
	BufferedReader br= null;
	BufferedWriter bw= null;
	// 객체를 생성시 socket을 전달 받아서 멤버변수에 저장합니다.
	// 생성자를 
	public UnicastServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}
	//run override하기
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		//스트림 연결 
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//get input stream 해서 소켓의 내용을 읽어드린다?
		bw =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
		// 클라이어느와 메세지를 송수신함
		while(true) {
			// 클라이언트가 보낸 메세지를 수신합니다
			String msg =br.readLine();
			System.out.println(msg);
			// 클라이언트로 메세지를 보냅니다.
			bw.write(msg+"\n");
			bw.flush();// 이메세지를 이용해서 버퍼를 지웁니다.
			}
		}catch(IOException e){
			// 연결이 끊어졌을때 있을  수 있는 상황
			//클라이어느와 연결이 끊어진 경우 예외가 발생함
			InetAddress ip = socket.getInetAddress();
			// 주소를 받아옵니다.
			String address= ip.getHostAddress();
			System.out.println("["+address+"]와의 연결이 끊어졌습니다.");
		}
	}
}
