package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class NonGenericEx {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Blue");
		a.add("Green");
		a.add("Yellow");
		a.add("Red");
		a.add("Purple");
		//System.out.println(a);
		
		a.remove(4);
		/*System.out.println(a);
		System.out.println(a.lastIndexOf("Red"));
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("Green"));
		
		for(String s:a)
		{
			System.out.println(s);
		}*/
		
		String s1=String.valueOf(a);
		System.out.println(s1);
		
		/*Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(a);*/
		
		
		

	}

}
