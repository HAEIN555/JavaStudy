package com.mapex;
import java.util.*;
public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		//new �ڿ� <String,Integer>�� ���� �����ϴ� 
		map.put("ȫ�浿",90);
		map.put("�̼���", 100);
		map.put("�̱���",60);
		map.put("���ڹ�",50);
		// key ���� ���� ������ String ���� ���´�. 
		Set<Map.Entry<String, Integer>>set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		//map .entry�� �������̽��̴�.
		/* Ű�� ���� set���·� ����(HashMap�� �̿��ؼ� key ��values�� �����ֱ� ���ؼ� entry�� �̿��Ѵ�.)
		 *  ���� ��Ʈ�� Ű�� ���� �ѽ� (���)�̴�.
		 *  Map.Entry ���� entrySet() �޼ҵ尡 �ִµ� 
		 *  entrySet() �޼ҵ�� ����(��Ŭ����)Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷��Ǻ並 �����ش�. 
		 *  ���� ��Ʈ�� ������ ����ϴ� ������ ����� �ݺ��ڸ� �̿��ؼ� ����Ѵ�. *�ݺ��ڴ� Iterator  
		 */
		while(it1.hasNext()) {
			Map.Entry<String, Integer> e= it1.next();
			System.out.println("�̸�"+e.getKey()+"����"+e.getValue());
		}
		Set set2 = map.keySet();
		System.out.println("�̸�"+set2);
		Collection<Integer> v = map.values();
		Iterator<Integer> it2  = v.iterator();
		int sum = 0;
		while(it2.hasNext()) {
			Integer i =it2.next();
		// ���� Integer�� �־ int������ �ص�����
			sum += i;
			System.out.print(i+" ");
			
		}System.out.println();
		System.out.println("���� :"+sum);
		System.out.println("��� :"+sum/set2.size()); // ���
		System.out.println("�ִ� :"+Collections.max(v)); // �ִ�
		System.out.println("�ּڰ� :"+Collections.min(v)); // �ּڰ�
	}

}