package study;
import java.io.*;
public class S006 {
// �ι��� 3�� 6���� 3������ ������ �޾Ƽ� ���� ��� �ݼ��� ��ü ������ ���ض�!
	public static void main(String[] args)throws IOException {
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String [] subname = {"����","����","����"};
		int [][][] sub= new int[2][3][subname.length+3];// ������ ���ڸ��� ����ֱ� ���ؼ� 4ĭ�� ����
		//0 - 1��° ��� 1 - 2��° ��� 2 - 3��° ��� 3���� 4���� 5��������
		float [][] avg = new float[2][3];
		
		for(int h=0;h<sub.length;h++) {
		for(int i=0;i<sub[h].length;i++) {//���
			for(int j=0;j<sub[h][i].length-3;j++) {
				do {
					System.out.print(subname[j]+"���� :");
					sub[h][i][j]=Integer.parseInt(br.readLine());
				}
				while(sub[h][i][j]<0||sub[h][i][j]>100);
				// ����
				sub[h][i][sub[h][i].length-3]+=sub[h][i][j];
				//sub[h][i][sub[h][i].length-3]=sub[h][i][sub[i].length-3]+sub[h][i][j]
			}
			avg[h][i]=sub[h][i][sub[h][i].length-3]/(float)(sub[h][i].length-3);
			sub[h][i][sub[h][i].length-2]=1;
			sub[h][i][sub[h][i].length-1]=1;
		}
		}
		//�ݼ���
		for(int h=0;h<sub.length;h++) {
		for(int i= 0;i<sub[h].length;i++) {
			for(int j=0;j<sub[h].length;j++) {
				if(sub[h][i][sub[h][i].length-3]<sub[h][j][sub[h][j].length-3]) {
					sub[h][i][sub[h][i].length-2]++;
				}
			}
		}
	}
		// ��������
		for(int h=0;h<sub.length;h++) {
			for(int i= 0;i<sub[h].length;i++) {
				for(int k=0;k<sub.length;k++) {
					for(int j=0;j<sub[h].length;j++) {
						if(sub[h][i][sub[h][i].length-3]<sub[k][j][sub[k][j].length-3]) {
							sub[h][i][sub[h][i].length-1]++;
						}
					}
				}
			}
		}
		
		
		
		//System.out.println(avg);
		// ��� 
		for(int h=0;h<sub.length;h++) {
			for(int i=0;i<sub[h].length;i++) {//���
			System.out.println();
			System.out.println("����"+sub[h][i][sub[h][i].length-3]);	
			System.out.println("���"+avg[h][i]);
			System.out.println("�� ����"+sub[h][i][sub[h][i].length-2]+"��");
			System.out.println("��������"+sub[h][i][sub[h][i].length-1]+"��");
			}
		}
	}
}
