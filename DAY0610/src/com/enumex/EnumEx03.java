package com.enumex;

public class EnumEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("서울인구"+City.SEOUL.getIngu());
		
		for(City c : City.values())
			System.out.printf("%s(%s) :%d%n",c,c.getCityName(),c.getIngu());
	}

}
