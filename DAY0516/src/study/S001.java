package study;
/*  �迭�� ����
 * �迭�� �ѹ� ������ �� �迭�� ũ�⸦ ������ �����ϴ�.
 * ũ�⸦ �� �ø��� ���� ��� ���� �ڷ��� �迭�� ���ϴ� ũ��� �غ��ϰ� 
 * ���� �迭�� �����ϸ� �۾��� �Ϸ��� �� ����
 * 	System.arraycopy() �޼ҵ� �̿�
 * ��ü�� ������� �ʾƵ� �ٷ� ��� �����ϴ� 
 * Public static void arraycopy(Object scr.int scrPos,Object dest,ind destPos,int length){
 * ..... ������ ä���ش�. }Pos = position�� ���� ������ ��ġ 
 *	src : �ҽ��迭
 *	srcPos : �ҽ��迭�� ���� ���� ��ġ
 *	dest : ���� �迭 
 *	desPos : ���� ������ġ (�ε����� ��ġ�� ǥ��) 
 *	length : ����Ǵ� �迭�� ����� �� 
 *  �迭�� ũ�⸦ �� Ű��� ���������� array.copy�� ����ؼ� ���縦 ���ְų� �������� �� ū �迭�� �����. 
 *  for���� �̿��� ����� ũ�⸦ �� ũ�� ������־ ���� �־��ִ� ��
 *  System.arraycopy�� ���� �Ѳ����� �ٲپ��ִ� �� 
 *  �ٽ� ���ؼ� for���� �迭�� ��� �ϳ��ϳ��� �����ؼ� ���������� arrarycopy()�� ������ ������ ������
 *  �ѹ��� ��°�� �����Ѵ�.
 *  for���� �ϳ��� �ٲپ��ִ� �� 
 *  
 */
public class S001 {

	public static void main(String[] args) {
		// �迭�� ����
		String[] scr = {"Java","DataBase","JSP","Spring"};// ���� 4���� �迭�� �������.
		String[] dest = new String [6]; // �迭�� ���縦 ���ؼ� 6���� �迭�� ������־���.
		dest[0]="OS";
		dest[1]="Network";
		// �ε��� 0�� 1���� ���� �־��־���. 
		System.arraycopy(scr, 0, dest, 2, 4);
	
		for(String str : dest) {
			System.out.println("dest value"+str);
			System.out.println();
			System.out.println();
			
		// for���� �̿��� ���� 
			int [] arr = new int [5];
			for(int i=0;i<arr.length;i++) {
				arr[i]=i+1;
				System.out.println(arr[i]+"\t");
			}
			System.out.println("������ arr.length"+arr.length);
			
			int [] temp = new int [arr.length*2];
			System.out.println("temp.length"+temp.length);
			
			//for���� �̿��ؼ� arr�迭��  ����� ���� temp �迭�� ���� 
			for(int i =0;i<arr.length;i++) {
				temp[i]=arr[i];
				System.out.println(temp[i]+"\t");	
			
			}arr = temp;// ������ ����Ǵ°Ŷ� ��°�� �������ش�. 
			System.out.println();
			System.out.println("������ arr.length"+arr.length);
			System.out.println();
			for(int i =0;i<arr.length;i++) {
				System.out.println(arr[i]+"\t");
			}
		}
		
	}

}
