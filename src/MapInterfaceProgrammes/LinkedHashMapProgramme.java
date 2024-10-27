package MapInterfaceProgrammes;

import java.util.LinkedHashMap;

public class LinkedHashMapProgramme {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map= new LinkedHashMap<Integer, String>();
		map.put(1, "Ash");
		map.put(2, "Abc");
		map.put(3, null);
		map.put(4, "ghi");
		map.put(null, null);
		
		//here insertion order is maintained
		System.out.println(map);
		
		LinkedHashMap<String, Integer> map1= new LinkedHashMap<String, Integer>();
		map1.put("a", 1);
		map1.put("ab", 2);
		map1.put("abc", 3);
		map1.put("abcd", 4);
		map1.put(null, null);
		
		System.out.println(map1);//{a=1, ab=2, abc=3, abcd=4, null=null}

	}

}
