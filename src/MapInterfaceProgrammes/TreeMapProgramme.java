package MapInterfaceProgrammes;

import java.util.TreeMap;

public class TreeMapProgramme {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Ash", 3);
		map.put("shra", 2);
		map.put("By", 5);
		
		System.out.println(map);//{Ash=3, By=5, shra=2}
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(5, "abc");
		tmap.put(6, "def");
		tmap.put(3, "ghi");
		tmap.put(1, "xyz");
		
		System.out.println(tmap);//{1=xyz, 3=ghi, 5=abc, 6=def}
		

	}

}
