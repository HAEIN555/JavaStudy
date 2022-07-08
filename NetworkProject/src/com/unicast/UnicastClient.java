package com.unicast;
//클라이언트 클래스 
import java.io.*;
import java.net.*;
// 클라이언트는 스레드가 필요없어요
public class UnicastClient {
	Socket socket = null;
	BufferedReader br= null;
	BufferedWriter bw= null;
	
	BufferedReader keyboard = null;
	
	public UnicastClient() {
		// TODO Auto-generated constructor stub
		try {
			// 소켓 생성
			socket = new Socket("localhost",5000);
			
			// 서버를찾을 수 없는 경우 서버와 연결이 끊어진경우
		} catch (UnknownHostException ue) {
			// TODO: handle exception
			System.out.println("서버를 찾을 수 없습니다.");
			System.exit(0);
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("서버와 연결할 수 없습니다.");
			System.exit(0);
		}
		try {
			//스트림 연결 
			
			// keyboard를 이용해서 
			keyboard = new BufferedReader(
					new InputStreamReader(System.in));
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw =  new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
		
			// 메세지를 주고 받음
			while(true) {
				// 키보드로 부터 입력한 내용 읽기 
				System.out.println("전송메세지 : ");
				String msg = keyboard.readLine();
				// 메세지를 서버로 전송
				bw.write(msg+"\n");
				bw.flush();// 버퍼를 비운다.
				String getMsg= br.readLine();
				System.out.println("수신된 메세지 : "+getMsg);
				}
			}catch(IOException e){
				//클라이언트와 연결이 끊어진 경우 예외가 발생함
				System.out.println("서버와 연결할 수 없습니다.");
				System.exit(0);
			}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new UnicastClient();
	}

}
