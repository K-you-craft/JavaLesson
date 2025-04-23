import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		//keyとvalue２つの要素を格納できる
		//.put(key,value)
		//順番を保証されない
		//key重複しない
		
		Map<String,Integer> nameMap = new HashMap<>();
		nameMap.put("Bob", 1);
		nameMap.put("Alice", 2);
		nameMap.put("John", 2);
		nameMap.put("Tom", 1);
		nameMap.put("Bob", 4);
		
		System.out.println(nameMap);
		
		Integer value = nameMap.get("Alice");
		System.out.println(value);
		
		Integer value2 = nameMap.get("Tarou");
		System.out.println(value2);//null
		
		nameMap.remove("Alice");
		System.out.println(nameMap);
		
		
	}

}
