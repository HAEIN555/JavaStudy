package com.inherit;
class Super{
	int x = 90;
	void superMethod() {
		System.out.println("super Mthod..");
		}
	}
class Sub extends Super{
	int y =10;
	void subMethod() {
		System.out.println("sub Mthod..");
		}
	}
class Subsub extends Sub{
	int z =20;
	void subSubMethod() {
		System.out.println("subSub Mthod..");
		}
	}
public class ExtendTest02 {
	public static void main(String[] args) {
		Subsub ss = new Subsub();
		System.out.println(ss.x);
		System.out.println(ss.y);
		System.out.println(ss.z);
		ss.superMethod();
		ss.subMethod();
		ss.subSubMethod();
	}

}
