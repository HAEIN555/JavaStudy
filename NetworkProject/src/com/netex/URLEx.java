package com.netex;
import java.io.*; // 입출력을 해야하니까
import java.net.*; // 네트워크 사용 위해!
public class URLEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// URL - (uniform resource locator)에 대한 정보를 가지고 있는 클래스 
		// 프로토콜 , 호스트명 , 포트번호 , 자원의 경로 , 쿼리스트링으로 정보를 얻는다.
		
		BufferedReader br= null;// 읽어와야하니까!
		try {
			URL url = new URL("http://www.naver.com/index.html");// 이것에 대한 정보를 알아보고싶다
			System.out.println("프로토콜 :"+url.getProtocol());
			System.out.println("호스트 : "+url.getHost());
			System.out.println("포트번호 : "+url.getPort());
			System.out.println("자원의 경로 : "+url.getPath());
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String str = null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		
				}catch (MalformedURLException e) {
					// TODO: handle exception
					// url을 잘못기입했을때 
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}finally {
					try { if(br!=null)
						br.close();
				} catch (IOException ee) {}
				
			}
		}
	}
