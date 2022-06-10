package com.utilEx;

public class StringBufferEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String buffer -- 문자열 저장 
		StringBuffer sb = new StringBuffer("1234567890");
		System.out.println(sb.capacity()); //16+10 기본 값 16에 10개를 더함 //26
		System.out.println(sb.length()); //10 길이값이 10개  10
		sb.append("ABCDEFGHIJKLMNOPQ");  //17개 
		System.out.println(sb.capacity()); //54개 ??????? 버퍼의 영역은 한번 설정되면 늘어나면 늘어났지 변화하지 않음
		// 똑같은 크기의 버퍼를 하나더 만들기때문에 늘어나려고!?!?!?!!?!?   26+26 버퍼의 갯수 2개  늘어나면 늘어난갯수만큼만 더하고 
		// 하나일때는 굳이 추가해주지 않아도 된다. 
		// 버퍼가 3개짜리는 만들어지지 않음 모자라면 크기를 하나더 늘리는거니까 
		System.out.println(sb.length()); //27개 
		sb.delete(1,20);
		System.out.println(sb.capacity()); // 안에 있는 데이터를 지울 순 있지지만 버퍼의 용량은 줄어들지 않는다. 
		System.out.println(sb.length());  // 값은 8 
		// String  Buffer은 DB에서 사용한다. 
		sb.append("QWERTYUIOPASDFGHJKRTFFDHDDGSVFJKRASGGRRYJYKREDGFDHHDRSD");// 55개 추가 
		System.out.println(sb.capacity());//110
	}

}
