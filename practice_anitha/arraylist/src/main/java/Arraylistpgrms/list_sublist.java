package Arraylistpgrms;

import java.util.ArrayList;
import java.util.Arrays;

public class list_sublist {

	public static void main(String[] args) {
//		ArrayList<Integer> Numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
//		Numbers.removeIf(num ->num%2==0);
//		System.out.println(Numbers);
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("anitha","aruna","deepa","pavan","charan"));
		Object arr[]=al.toArray();
		//System.out.println(arr);
		
		System.out.println(al.lastIndexOf(arr));
		
//		System.out.println(al.subList(0, 3));
//		
//		for(String ab:al)
//		{
//			System.out.println(ab);
//		}
		
	}

}
