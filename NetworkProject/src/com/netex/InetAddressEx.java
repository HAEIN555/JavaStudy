package com.netex;
import java.net.*;
public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InetAddress 객체는 생성자가 아닌 static메소드를 이용해서 객체를 생성한다.
		try {
			InetAddress ipinfo1= 
					InetAddress.getByName("www.naver.com");
			//ip주소 얻어오기
			String ip = ipinfo1.getHostAddress();
			System.out.println("ip주소"+ip);
			
			InetAddress[] ipArray = 
					InetAddress.getAllByName("www.naver.com");
			for(InetAddress tempip: ipArray) {
				System.out.println(tempip);
			}//네이버가 가지고 있는 여러개의 ip가 나온다. (2개정도 나온다!)
			
			// 현재 본인 컴퓨터 ip 정보
			InetAddress myHost = InetAddress.getLocalHost();
			System.out.println("My ip  : "+myHost.getHostAddress());// 호스트의 주소가 나온다!
			System.out.println("host name"+myHost.getHostName());// 호스트의 이름이 나온다!
			System.out.println(myHost);// 이름과 호스트 주소가 같이 나온다!
			//본인의 ip주소가 나온다.
			//cmd에서도 ipconfig치면나오니까 비교해보기
			
		} catch (UnknownHostException uhe) {
			// TODO: handle exception
			// 호스트 이름을 찾지 못했을경우에써주는 예외처리
			uhe.printStackTrace();
		}
	}

}
