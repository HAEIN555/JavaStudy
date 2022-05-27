package study2;

import java.util.Scanner;

public class WriteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("등록할 회원의 정보를 입력하세요");
		System.out.println("이름:");
		String name =sc.next();
		System.out.println("E-mail :");
		String email =sc.next();
		System.out.println("나이는 :");
		int age= sc.nextInt();
		System.out.println("국가는 :");
		String nation =sc.next();
		System.out.println("전화번호는 :");
		String tel = sc.next();
		
		MemberVo member =new MemberVo(age, name, tel, email, nation);
		//addMember(member);
		
	}
	/*
	 * // 멤버 추가저장 메소드 private void addMember(MemberVo member) { // 멤버를 추가하는 배열을
	 * 만들어주는 거 +1이 배열의 길이를 늘려간다. MemverVo[] temp = new
	 * MemberVo[MemberMain.members.length+1]; for(int i =0;
	 * i<MemberMain.members.length;i++) { temp[i]=MemberMain.members[i]; } }
	 */

}
