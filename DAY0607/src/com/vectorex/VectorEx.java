package com.vectorex;
import java.util.*;
public class VectorEx {
	private static final String colors[] =
		{"ÆÄ¶û" , "Çá¾á" , "³ë¶û " , "³ì»ö", "°ËÁ¤" , "ÁÖÈ²" , "¿¬µÎ"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i;
			String str;
			Vector<String> v = new Vector<>();
			for(i=0;i<colors.length;i++)
				v.add(colors[i]);
			
			System.out.println("ÀüÃ¼ Ãâ·Â");
			Iterator <String>it =v.iterator();
			while(it.hasNext()) {
				str =it.next();
				System.out.print(str+" ");
			}
	}

}
