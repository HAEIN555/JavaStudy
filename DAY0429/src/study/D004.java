package study;
public class D004 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������� ���������� *�� ����ϼ���! �׷� \����� �밢���� ��µǾ���մϴ�
		int i,j;
		for (i=1;i<=5;i++) {
			for(j=1;j<=5;j++){
				if(j==i)
				{System.out.printf("(%d,%d)" ,i,j);}
				else if(j!=i)
				{System.out.printf(" ");}
			}System.out.println();
		}
		/*(1,1)    
 			(2,2)   
  				(3,3)  
   					(4,4) 
    					(5,5)
		 */
		int a,b;
		String s;
		for(a=1;a<=5;a++) {
			for(b=1;b<=5;b++) {
				s=(a==b)? "("+a+","+b+")":" ";
				System.out.print(s);
			}
		System.out.println();	
		}
		
		
		
		
		
		
	}

}
