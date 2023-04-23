package Arraylistpgrms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hasmap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();

		map.put("Anitha", "Anu");
		map.put("Jagadeesh", "jaga");
		map.put("vishnu", "sanny");

		map.put("andra", "Amaravathi");
		map.put("hyd", "telangana");
		map.put(null, "vani");
		map.put("roja", null);
		map.put("jagan", null);

//		System.out.println(map.get("Anitha"));
//		System.out.println(map.get("Jagadeesh"));

//		Iterator<String> it =map.keySet().iterator();
//		while(it.hasNext())
//		{
//			String key=it.next();
//			String value=map.get(key);
//			System.out.println("    "    +key+     "  "+     value);
//		}

		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

	}

}
