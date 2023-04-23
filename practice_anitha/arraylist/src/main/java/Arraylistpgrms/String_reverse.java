package Arraylistpgrms;

import java.util.Scanner;

public class String_reverse {

	public  static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter the String Name");
//		String name=sc.next();
		
		String name="Anitha";
		int a=name.length();
		String rev = "";
		for(int i=a-1;i>=0;i--)
		{
			
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
		
		
	}

}
