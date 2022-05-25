package review;

public class D001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int i,j;
		 for(i=1;i<=5;i++) {
			 for(j=1;j<=5-i;j++) {System.out.print("  ");}
			 for(j=-i;j<=i;j++) {
				 if(j==0||j==1) continue;
				 System.out.print(Math.abs(j));
			 }
			 System.out.println();
			 
	}
		 
		 
		 
	int u,f;
	final int MAX=5;
	for(u=0;u<=MAX;u++)
	{
		for(f=MAX;f>=-MAX;f--) {
			if(Math.abs(f)>u)System.out.print("*");
			else System.out.printf("%d",Math.abs(f));		}
		System.out.println();
	}
	}
}
