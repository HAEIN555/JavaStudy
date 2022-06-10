package treemapex;

public class SungRec {
	
	private String name;
	private int kor,eng,mat,tot;
	
	public SungRec() {
		// TODO Auto-generated constructor stub
	}// 생성자
	public SungRec(String name,int kor,int eng,int mat) {
		// TODO Auto-generated constructor stub
		this.name= name;
		this.kor = kor;
		this.eng= eng;
		this.mat = mat;
		
	}// 초기화 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot = kor+eng+mat;
		return tot ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
