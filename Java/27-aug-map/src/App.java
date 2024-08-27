import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> cm=new LinkedHashMap<>();
		cm.put(5, "Australia");
		cm.put(1, "India");
		cm.put(2, "Japan");
		cm.put(2, "China");
		cm.put(4, "Pakistan");
		
		//there are several ways we can iterate a map
		//1) using iterator. There is no iterator for map.
		//but all keys can be obtained using keyset() method
		
//		Set<Integer> keys = cm.keySet();
//		Iterator<Integer> it = keys.iterator();
//		while(it.hasNext())
//		{
//			Integer key = it.next();
//			System.out.println(key+"\t"+cm.get(key));
//		}
		
		
		//using entrySet
		
//		Set<Entry<Integer, String>> entries = cm.entrySet();
//		Iterator<Entry<Integer, String>> it = entries.iterator();
//		while(it.hasNext())
//		{
//			Entry<Integer, String> entry = it.next();
//			System.out.println(entry.getKey()+"\t"+entry.getValue());
//		}
		
		
		
		//3) using for each loop
		//for each loop not possible on map. but get entries as a set
		for(Entry<Integer, String> entry:cm.entrySet())
		{
			System.out.println(entry.getKey()+'\t'+entry.getValue());
		}
		
	}

}
