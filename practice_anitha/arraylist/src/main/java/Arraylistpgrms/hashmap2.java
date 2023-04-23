package Arraylistpgrms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashmap2 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("Anitha", "Anu");
		map.put("Jagadeesh", "jaga");
		map.put("vishnu", "sanny");
		map.put("andra", "Amaravathi");
		map.put("hyd", "telangana");
		map.put(null, "vani");//key allows null at once only
		map.put("roja", null);//value allows null at number of times
		map.put("jagan", null);
		
		
//		Iterator<String> itr=map.keySet().iterator();
//		
//		while(itr.hasNext())
//		{
//			String key=itr.next();
//			String value=itr.get(value);
//			System.out.println(key+"  "+value);
//		}
//		
//		map.forEach(k,v)->{
//			System.out.println(key+ " "+value);
//		});
		
//		System.out.println(map);
		
		
//		Set set = map.keySet();
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			Object obj = it.next();
//			String str = (String)obj;
//			System.out.println(str );
//	     }
		
		Set set=map.keySet();
		Iterator itr=set.iterator();
		 while(itr.hasNext())
		 {
			 String key=itr.next();
		 }
		
		
		}
		}


