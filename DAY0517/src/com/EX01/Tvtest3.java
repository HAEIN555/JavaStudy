package com.EX01;

public class Tvtest3 {

	public static void main(String[] args) {
	
	Tv[]	tv; // 객체배열을 선언했다.
	tv = new Tv[5]; //tv에 대한 생성자 , 5개의 객체배열을 만들었다. //배열의 길이를 정했다.
	//5개의 배열에 값을 넣어줄 수 있다. 
	for (int i=0;i<tv.length;i++) {
		tv[i]=new Tv(); 
		tv[i].channel=i+10;
		// 값으로 10.11.12.13.14까지 간다. tv[i]라는 채널에 10을 저장한다.
		//System.out.println(tv[i].channel);
	}
		
	for (int i=0;i<tv.length;i++) {
		tv[i].channelup(); //tv라고 하는 채널을 올린다. tv[i].channelUp() 메소드를 호출하여 채널을1증가
		System.out.printf("tv[%d].channel=%d\n",i,tv[i].channel);
	}
		
	}

}
