package com.except;

public class ArrayExcept {

	public static void main(String[] args) {
		
		int [] intArray = new int [5];
		intArray [0] =0;
		try {
		for(int i =0;i<intArray.length;i++) {
			intArray[i+1] = i+i +intArray[i];
			System.out.println("intArray["+i+"] :"+intArray[i]);
			}
		}catch (IndexOutOfBoundsException  e) {
			// TODO: handle exception
			System.out.println("¹è¿­ÀÇ ÀÎµ¦½º ¹üÀ§°¡ ¹þ¾î³µ½À´Ï´Ù.");
		}
		
	}

}
