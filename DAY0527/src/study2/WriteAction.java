package study2;

import java.util.Scanner;

public class WriteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("����� ȸ���� ������ �Է��ϼ���");
		System.out.println("�̸�:");
		String name =sc.next();
		System.out.println("E-mail :");
		String email =sc.next();
		System.out.println("���̴� :");
		int age= sc.nextInt();
		System.out.println("������ :");
		String nation =sc.next();
		System.out.println("��ȭ��ȣ�� :");
		String tel = sc.next();
		
		MemberVo member =new MemberVo(age, name, tel, email, nation);
		//addMember(member);
		
	}
	/*
	 * // ��� �߰����� �޼ҵ� private void addMember(MemberVo member) { // ����� �߰��ϴ� �迭��
	 * ������ִ� �� +1�� �迭�� ���̸� �÷�����. MemverVo[] temp = new
	 * MemberVo[MemberMain.members.length+1]; for(int i =0;
	 * i<MemberMain.members.length;i++) { temp[i]=MemberMain.members[i]; } }
	 */

}
