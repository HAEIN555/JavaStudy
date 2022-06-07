package HW;

public class Deck {
	
public static void main(String[] args) {
	
	String name;
	String num;
	
	Card card=new Card();
	
	for(int i=1;i<=4;i++) {
		name=card.str1(i);
		for(int j=1;j<=13;j++) {
			num =card.str2(j);
			System.out.print("'"+name+" "+num+"'"+", ");
		}
	}
	
	
	
}
}
