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
		Color color = ee.getMyColor(); // �������� ����ִ� ������ ��ü�� ��� 
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
