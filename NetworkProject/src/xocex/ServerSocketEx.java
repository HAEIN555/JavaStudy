package xocex;
import java.net.*;
public class ServerSocketEx {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		// 서버는 사용자들의 접속을 받아들이기 위해서 serverSocket이 필요함
		ServerSocket ss = new ServerSocket(3000);
		//서버가 생성되면 클라이언트가 와서 접속할때까지 무한정 기다려야 한다.
		
		while (true) {
			// 클라이언트가 접속할때까지 무한정 대기!
			Socket s = ss.accept();
			
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip+"님이 접속했습니다.");
			// 먼저 서버를 열고 
		}
		
	}

}
