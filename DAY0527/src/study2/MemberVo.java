package study2;

public class MemberVo {
	// ���������̴ϱ� private���� ������ֱ� 
	private String name;
	private String email;
	private String tel;
	private String nation;
	private int age;
	
	public MemberVo(int age,String name,String tel,String email,String nation) {// �����ڷ� �ʱ�ȭ 
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name=name;
		this.tel= tel;
		this.email=email;
		this.nation=nation;
		
	}
	// getter ,setter �� ������ֱ� 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
