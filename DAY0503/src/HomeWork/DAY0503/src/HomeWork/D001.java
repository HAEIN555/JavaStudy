package HomeWork.DAY0503.src.HomeWork;

public class D001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* i는곱하기j는 단수
		 * 2*1=2 
		 */
		int i,j,k;
		for(k=1;k<=3;k++) {
		  for(i=1;i<=9;i++) {
			for(j=3*k-1;j<=3*k+1;j++) {
				if(j>=10) {break;}
				System.out.printf("%dX%d=%d\t",j,i,(i*j));}
			System.out.println();
		}
	}
	}
}
