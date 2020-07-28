import java.util.*;
public class TestDictionary
{
	public static void main(String args[])
	{
		Map map=new HashMap();
		map.put("Topi","Hat");
		map.put("Pustak","Book");
		map.put("Khurchi","Chair");
		map.put("Chawi","Key");
		map.put("Pishwi","Bag");
		System.out.println("Map:"+map);
		System.out.println("Map size: " +map.size());
		System.out.println("Map keyset: " +map.keySet());
		System.out.println("Access value of Topi: " +map.get("Topi"));
		System.out.println("Remove Pishwi: " +map.remove("Pishwi"));
		System.out.println("Access value of Pishwi: " +map.get("Pishwi"));
		System.out.println("Map:" +map);
		System.out.println("Map size: " +map.size());
	}
}