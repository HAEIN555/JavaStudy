package com.inherit;
	class House{
	int price; // 멤버 변수 선언! 
	int size;
	String dong;
	String kind; // 아파트인지 빌라인지 
	public House() {
		// 누구를 호출할 것인가 
		this(100,32,"상계동","아파트");
	} // 기본생성자 
	public House(int price) {
		this(price,32,"상계동","아파트");
	}// 오버로딩
	public House(int price,int size) {
		this(price,size,"상계동","아파트");
	}// 오버로딩
	public House(int price,int size,String dong) {
		this(price,size,dong,"아파트");
	}// 오버로딩
	public House(int price,int size,String dong,String kind) {
		// 초기 작업
		this.price =price;
		this.size= size;
		this.dong=dong;
		this.kind=kind;
	}// 오버로딩
	
}
	public class ThisConstructorExam {

	public static void main(String[] args) {
		
		House h1 =new House(); //100,32,상계동,아파트로 값이 주어진다!
		System.out.println("H1.price="+h1.price+","+"h1.size="+h1.size+"h1.dong="+h1.dong+"h1.kind="+h1.kind);
		House h2 =new House(300);  //300,32,상계동,아파트로 값이 주어진다!
		System.out.println("H2.price="+h2.price+","+"h2.size="+h2.size+"h2.dong="+h2.dong+"h2.kind="+h2.kind);
		House h3 =new House(300,40); //300,40,상계동,아파트로 값이 주어진다!
		System.out.println("H3.price="+h3.price+","+"h3.size="+h3.size+"h3.dong="+h3.dong+"h3.kind="+h3.kind);
		House h4 =new House(300,40,"서초동"); //300,40,서초동,아파트로 값이 주어진다!
		System.out.println("H4.price="+h4.price+","+"h4.size="+h4.size+"h4.dong="+h4.dong+"h4.kind="+h4.kind);
		House h5 =new House(300,40,"서초동","빌라"); //300,40,서초동,빌라로 값이 주어진다!
		System.out.println("H5.price="+h5.price+","+"h5.size="+h5.size+"h5.dong="+h5.dong+"h5.kind="+h5.kind);
	}

}
