package study;

public class AccountEX {

	public static void main(String[] args) {
		// �ν��Ͻ�(��ü) ����
		Account ac =new Account();
		//ac.money =10000; ac.�ص� �����°� ���� �ֳ��ϸ� account class���� private���� ���������ڸ� �ɾ���� 
		ac.setMoney(10000, "1234");
		int mypay =ac.getMoney();
		System.out.println("���� ���� �ܾ�"+mypay);
	}

}
