
package study;

public class D001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ����! for���� �̿��ؼ� 2.3.4
		 *                             5.6.7 
		 *                             8.9 
		 *��� ���� �� �ְ� ����ϼ���!
		 *������ 5/3���� �غ�����!                              
		 */
		// 1-100���� ���� �߿� 2.3.5.7�� ����� ������ ���� ���࿡ 10���� 
		// ����ϴ� ���α׷��� �ۼ��ϼ���! for���� �ϳ� �̿��ϼ���!
		int a,b=1;
		for(a=1;a<=100;a++) {
			if(a==1||a%2==0||a%3==0||a%5==0||a%7==0) {continue;}
			System.out.printf("%d,",a);
		}System.out.println();
		
		int i, cnt=1;
		for (i =1;i<=100;i++) {
			if((i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0))
			//System.out.printf("%d%c",i,(cnt%10!=0)? ' ':'\n');
			System.out.printf("%3d%c",i,(cnt++%10!=0)?' ':'\n');
			// cnt�� �����ؼ� 10���� ���������ٸ� �ٹٲ��� ���ش�! �׷���cnt++ �� �����°Ŵ�!
		}
		
		
		
		
		
	}

}
