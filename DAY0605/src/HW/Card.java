package HW;

public class Card {
	
	String CardName;
	String Cardnumber;
	
	String str1(int a) {
	
	switch (a) {
	case 1:CardName="Ŭ��";break;
	case 2:CardName="���̾Ƹ��";break;
	case 3:CardName="��Ʈ";break;
	case 4:CardName="�����̵�";break;
	}
	return CardName;
	}
	String str2(int a) {
		switch (a) {
		case 1:Cardnumber ="���̽�";break;
		case 2:Cardnumber ="2";break;
		case 3:Cardnumber ="3";break;
		case 4:Cardnumber ="4";break;
		case 5:Cardnumber ="5";break;
		case 6:Cardnumber ="6";break;
		case 7:Cardnumber ="7";break;
		case 8:Cardnumber ="8";break;
		case 9:Cardnumber ="9";break;
		case 10:Cardnumber ="10";break;
		case 11:Cardnumber ="��";break;
		case 12:Cardnumber ="��";break;
		case 13:Cardnumber ="ŷ";break;
		}
		return Cardnumber;
	}
}
