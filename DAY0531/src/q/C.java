package q;
 class C {
void g() {
	B b = new B(); // 같은 패키지 안에 있으니까 상관 없다. 
	// 같은 패키지내에 접근은 허용한다. 
	b.n =7;
	b.g();
}
}
