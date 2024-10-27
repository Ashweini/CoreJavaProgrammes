package MapInterfaceProgrammes;

import java.util.HashMap;

public class MapMethods {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Ash");
		map.put(2, "Abc");
		map.put(3, "efc");
		map.put(4, "ghi");
		map.put(null, null);
		
		//{null=null, 1=Ash, 3=efc, 4=ghi}
		
		//containsKey()
		System.out.println(map.containsKey(2));//true - 2 key is present inside map collection
		//containsValue() - accepts the object
		System.out.println(map.containsValue("Ash"));//true
		
		//remove()
		System.out.println(map.remove(2));
		System.out.println(map);
		
		//remove() - by value
		//not possible to remove by value
		System.out.println(map.remove("Ash"));//null
		System.out.println(map);//{1=Ash, 3=efc, 4=ghi}
		
		//KeySet
		System.out.println(map.keySet());//[1, 3, 4]
		
		//values()
		System.out.println(map.values());//[Ash, efc, ghi]

		//size
		System.out.println(map.size());//3
		
		//isEmpty
		System.out.println(map.isEmpty());//false
		
		//entrySet - whatever key_value entries we will get => set of same element present in a map
		System.out.println(map.entrySet());//[1=Ash, 3=efc, 4=ghi]
		
		//clear()
		map.clear();
		System.out.println(map);//{} =>cleares all map
		
		//we can add null - but should be only one
		map.put(null, null);
		System.out.println(map);
		
	}

}
