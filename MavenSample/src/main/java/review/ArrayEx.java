package review;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		li.add("Blue");
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		
		//System.out.println(li);
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(li.contains("Green"));
		
	}

}
