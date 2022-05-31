package p;
import q.B;
 class A {
	
	void f() {
		//C c = new C(); // 패키지가 틀릴때 가져오는 건 불가능 하다 
		B b = new B();
		b.n =3;
		b.g();
	}

}
