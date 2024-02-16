import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Addy", 25);
		myMap.put("Joy", 48);
		myMap.put("Mano", 30);
		System.out.println(myMap.size());
		String searchStr = "Joy";
		boolean found = myMap.containsKey(searchStr);
		System.out.println("Found is "+found);
		if(found) {
			Integer value = myMap.get(searchStr);
			System.out.println("score of "+searchStr+" is "+value);
		}
		else {
			System.out.println("Not found");
		}
		//myMap.replace("Mano", 95);
		myMap.compute("Jack", (key,v)->v==null?0:v+10);
		for (var key : myMap.keySet()) {
			System.out.println(key+":"+myMap.get(key));
		}
		System.out.println("--loop by Foreach--");
		myMap.forEach((k,v)->System.out.println(k+":"+v));
		System.out.println("--loop by foreach and method reference--");
		myMap.entrySet().stream().map(e->e.getKey()+":"+e.getValue()).forEach(System.out::println);
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("joe", 48);
		treeMap.put("addy", 48);
		treeMap.put("joy",55);
		treeMap.put("jack", 18);
		System.out.println("--Tree map --");
		treeMap.forEach((k,v)->System.out.println(k+":"+v));
	}

}
