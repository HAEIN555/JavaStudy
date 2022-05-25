package study2;

public class AbsExam extends AbsEX02 {
	
	
	public static void main(String[] args) {
		AbsExam ae= new AbsExam();
		System.out.println("ae.getA():"+ae.getA());
		System.out.println("ae.getStr():"+ae.getStr());
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return str; // AbsEX01ÀÇ ¸â¹ö º¯¼ö 
	}

	
}
