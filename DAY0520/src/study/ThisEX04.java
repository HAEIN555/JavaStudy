package study;

class ThisEx{
	
String name ,jumin ,tel;

	public ThisEx() {
	this.name ="Guest";
	this.jumin = "000000-000000";
	tel ="000-0000-0000";
	}
	
	
	public ThisEx(String name) {
		this();
		this.name =name;
		}
		
	public ThisEx(String name,String jumin) {
		this(name);
		this.jumin =jumin;
		}
	
	public ThisEx(String name,String jumin,String tel) {
		this(name,jumin);
		this.tel =tel;
		
		}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJumin() {
		return jumin;
	}


	public void setJumin(String jumin) {
		this.jumin = jumin;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
}

public class ThisEX04 {

	public static void main(String[] args) {
		
		ThisEx t= new ThisEx();
		System.out.println("Name :"+t.getName());
		System.out.println("Jumin :"+t.getJumin());
		System.out.println("Tel :"+t.getTel());
	}

}
