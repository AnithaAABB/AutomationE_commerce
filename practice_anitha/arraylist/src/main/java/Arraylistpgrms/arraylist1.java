package Arraylistpgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class arraylist1 {

	public static void main(String[] args) {
		List al = new ArrayList();

		al.add("anitha");
		al.add("anusha");
		al.add("aruna");
		al.add("anitha");
		al.add("sameera");
		al.add("alakanandha");
		
		

		List bl = new ArrayList();

		bl.add("jagadeesh");
		bl.add("vishnu");
		bl.add("pavan");
		bl.add("charan");
		
		//System.out.println(al.addAll(bl));
	
		
		//System.out.println(al);
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al);
//		}
//		
		
     	//ListIterator<String> itr=al.listIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		while(itr.hasPrevious())
//		{
//			System.out.println(itr.previous());
//		}
     	
		    	
     	
     	
//		al.forEach(a->{
//			System.out.println(al);
//		});
		
//		al.addAll(bl);
//		System.out.println(al);
//
//		al.add(2, bl);
//		System.out.println(al);
//
//		al.clear();
//		System.out.println(al);
//
//				System.out.println(al.contains("anitha"));//true
//				System.out.println(al.contains("balaji"));//false
//				System.out.println(al.indexOf("aruna")>0);//true
//				System.out.println(al.equals(bl));//compare al and bl lists
//				System.out.println(al.get(2));//index 2 name print
//				System.out.println(al.isEmpty());//names will be there
//
//				List<String> namelist=new ArrayList<String>(Arrays.asList("tom","roja","jerry","john","tom"));
//				System.out.println(namelist);
//				int i=namelist.lastIndexOf("tom");
//				System.out.println(i);//4 bsz of 2 same names tom
//				
//				namelist.retainAll(Collections.singleton("tom"));

	}
}
