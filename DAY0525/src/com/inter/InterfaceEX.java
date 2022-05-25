package com.inter;

public class InterfaceEX implements InterEX {

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return A;
	}

	public static void main(String[] args) {
		InterfaceEX ie = new InterfaceEX();
		System.out.println("getA():"+ie.getA());

	}

}
