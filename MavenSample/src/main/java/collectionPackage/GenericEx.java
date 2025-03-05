package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("Blue");
		li.add("Green");
		li.add("Red");
		li.add("Purple");
		System.out.println(li);
		System.out.println(li.indexOf("Red"));
		li.set(3, "Yellow");
		System.out.println(li);
		System.out.println(li.lastIndexOf("Yellow"));
		li.remove(0);
		System.out.println(li);
		
		for(String s:li)
		{
			System.out.println(s);
		}
		int a[]= {1,2,3,4};
		for(int i:a)
		{
			System.out.print(i);
		}
		
		
	}

}
