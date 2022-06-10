package com.enumex;

public class EnumEx01 {
		private Color myColor = Color.Red;
	
		public EnumEx01() {
			// TODO Auto-generated constructor stub
		}
	
		public Color getMyColor() {
			return myColor;
		}
		public void setMyColor(Color myColor) {
			this.myColor = myColor;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumEx01 ee = new EnumEx01();
		ee.setMyColor(Color.Green);
		Color color = ee.getMyColor(); // 열거형에 들어있는 데이터 자체가 상수 
		switch (color) {
		case Red:
			System.out.println("red");
			break;
		case Green:
			System.out.println("green");
			break;
		case Blue:
			System.out.println("blue");
			break;

		}
	}

}
