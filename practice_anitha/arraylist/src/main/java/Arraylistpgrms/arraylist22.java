package Arraylistpgrms;

import java.util.ArrayList;
import java.util.ListIterator;

public class arraylist22 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Anitha");
		al.add("Aruna");
		al.add("Deepa");
		al.add("jagadeesh");
		al.add("vishnu");
		
//		System.out.println(al);
		
//		for(String ab:al)
//		{
//			System.out.println(ab);
//		}
		
//		ListIterator itr=al.listIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al);
//		}
		
		
		al.forEach(a ->{
			System.out.println(al);
		});
		
	}

}
