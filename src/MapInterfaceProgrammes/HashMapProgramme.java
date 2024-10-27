package MapInterfaceProgrammes;

import java.util.HashMap;

public class HashMapProgramme {
	
	public static void main(String[] args) {
		HashMap<Integer, String>  map = new HashMap<Integer, String>();
		//put() to add values to map
		map.put(1, "Shraddha");
		System.out.println(map);
		
		//value is re-initializing for key 1
		map.put(1, "Ash");
		//we can't add duplicate it just re-inialize
		map.put(1, "xyz");
		//duplicate key are not allowed but we can add duplicate values 
		map.put(2, "xyz");
		System.out.println(map);
		
	}

}
