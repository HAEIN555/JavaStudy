package Com.method_;

public class Referenceparameter {
	
	public void increase(int[]n) {
		for(int i=0;i<n.length;i++) {
			n[i]++;
		}
	}
	
	
	public static void main(String[] args) {
		
		int [] ref = {100,600,1000};// 참조형배열
		// 객체 생성
		Referenceparameter rp= new Referenceparameter();
		// 메소드 호출시
		// 전달하려는 인자를 참조 (객체)자료형을 사용할 경우를 의미한다. 
		// 객체가 아닌 배열을 이용하여 호출한다.
		// call by reference
		rp.increase(ref);
		for(int i=0;i<ref.length;i++) {
			System.out.println("ref["+i+"]:"+ref[i]);
		}

	}

}
