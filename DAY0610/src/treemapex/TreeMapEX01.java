package treemapex;

import java.util.*;
import java.io.*;

public class TreeMapEX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> map = new TreeMap<>();
		map.put("��ȭ","�����޺� ŰŰ");
		map.put("ȣ��","��ũ��");
		map.put("��ȭ", "Ȳȥ���� ��������");
		map.put("��ȭ", "����");
		map.put("TV", "X-files");
		System.out.println(map);
		
		Map<String, String> subMap = map.subMap("��ȭ", "ȣ��"); // ������ ������ �� �ִ�. 
		System.out.println(subMap);
		//{TV=X-files, ��ȭ=�����޺� ŰŰ, ��ȭ=����, ��ȭ=Ȳȥ���� ��������, ȣ��=��ũ��}
		//{��ȭ=����, ��ȭ=Ȳȥ���� ��������} 
		
		/* Tree Map Ŭ������ ��Ʈ (����) �� ���·� �ڷᰡ �߰��ȴ�.
		 * Tree map Ŭ������ SotredMap<k,v>sub Map (k from key,k to key)�޼ҵ� 
		 * from key key�� �����Ѵ�. to key key�� �������� �ʴ´�. 
		 * Ű ������ �κ������� �����ϸ� ������ 
		 */
	}

}
