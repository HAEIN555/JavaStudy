package Com.method_;

public class Referenceparameter {
	
	public void increase(int[]n) {
		for(int i=0;i<n.length;i++) {
			n[i]++;
		}
	}
	
	
	public static void main(String[] args) {
		
		int [] ref = {100,600,1000};// �������迭
		// ��ü ����
		Referenceparameter rp= new Referenceparameter();
		// �޼ҵ� ȣ���
		// �����Ϸ��� ���ڸ� ���� (��ü)�ڷ����� ����� ��츦 �ǹ��Ѵ�. 
		// ��ü�� �ƴ� �迭�� �̿��Ͽ� ȣ���Ѵ�.
		// call by reference
		rp.increase(ref);
		for(int i=0;i<ref.length;i++) {
			System.out.println("ref["+i+"]:"+ref[i]);
		}

	}

}
