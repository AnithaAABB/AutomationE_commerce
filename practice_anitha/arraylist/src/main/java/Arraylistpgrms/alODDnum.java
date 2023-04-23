package Arraylistpgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class alODDnum {         /////print odd numbers

	public static void main(String[] args) {
//		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.removeIf(num -> num%2==0); //use lamda expression
//		System.out.println(numbers);
		
		
//		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//		numbers.removeIf(num -> num%2!=0);
//		System.out.println(numbers);
//		
		
//		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
//		ArrayList<Integer> sublist=new ArrayList<Integer>(numbers.subList(2,8));
//		System.out.println(sublist);
//		
		List<String> namelist=new ArrayList<String>(Arrays.asList("tom","roja","jerry","john","tom"));

		Object arr[]=namelist.toArray();
		System.out.println(Arrays.toString(arr));
		
//		for(Object o:arr)
//		{
//			System.out.println(o);///////output line by line
//		}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
