package com.unicast;
import java.io.*;
import java.net.*;
public class UnicastServer {
	// 먼저 서버 실행 클라이언트 실행 메시지 전송
	// 먼저 만드는건 UnicastServer - UnicastThread- UnicastClient
	public UnicastServer() {
		// TODO Auto-generated constructor stub
		ServerSocket server = null;
		try {
				// 서버 소켓 생성
				server = new ServerSocket(5000);
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println("해당포트가 사용중입니다!");
					System.exit(0);
				}
		try {
			while (true) {
				System.out.println("Server Ready~!");
				Socket socket = server.accept();
				// 클라이언트와 메세지를 송수신할 수 있는 스레드 생성
				// 스레드 생성시 Socket을 전달받아서 구현합니다.
				// 스레드를 시작합니다!
				//(UnicastServerThreadclass참고!)
				
				// 스레드 객체!
				UnicastServerThread thread = new UnicastServerThread(socket);
				// 스레드를 만든다음에 호출
				thread.start();// 클라이언트가 만들어지고 실행해야 한다!
				}
			} catch (IOException ii) {
			// TODO: handle exception
				ii.printStackTrace();
		}
		
	}// 생성자를 꾸며서 메인을 간단히 만든다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UnicastServer();
	}

}
