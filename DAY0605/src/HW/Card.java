package HW;

public class Card {
	
	String CardName;
	String Cardnumber;
	
	String str1(int a) {
	
	switch (a) {
	case 1:CardName="클럽";break;
	case 2:CardName="다이아몬드";break;
	case 3:CardName="하트";break;
	case 4:CardName="스페이드";break;
	}
	return CardName;
	}
	String str2(int a) {
		switch (a) {
		case 1:Cardnumber ="에이스";break;
		case 2:Cardnumber ="2";break;
		case 3:Cardnumber ="3";break;
		case 4:Cardnumber ="4";break;
		case 5:Cardnumber ="5";break;
		case 6:Cardnumber ="6";break;
		case 7:Cardnumber ="7";break;
		case 8:Cardnumber ="8";break;
		case 9:Cardnumber ="9";break;
		case 10:Cardnumber ="10";break;
		case 11:Cardnumber ="잭";break;
		case 12:Cardnumber ="퀸";break;
		case 13:Cardnumber ="킹";break;
		}
		return Cardnumber;
	}
}
