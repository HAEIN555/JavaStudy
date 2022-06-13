package treemapex;
import java.util.*;
import java.io.*;
public class TreeMapEX02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,SungRec>map= new TreeMap<String,SungRec>();
		map.put("3333", new SungRec("±è¸»ÀÚ",80,80,70));
		map.put("2222", new SungRec("ÀÌ¼ø½Å",100,100,100));
		map.put("1111", new SungRec("À¯Çý¹Î",90,80,80));
		map.put("4444", new SungRec("°¡À¯Áø",90,90,90));
		map.put("5555", new SungRec("±èÀ¯½Å",70,80,70));
		
		String key;
		Set set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			key = it.next();
			SungRec data = map.get(key);
			System.out.printf("%7s%10s%5d%5d%5d%5d\n",
					key,data.getName(),data.getKor(),data.getEng(),data.getMat(),data.getTot());
		}
	}
}
