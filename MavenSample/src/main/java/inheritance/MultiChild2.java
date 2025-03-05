package inheritance;

public class MultiChild2 extends MultiParent {
	public MultiChild2()
	{
		super();
		MultiChild1 obj=new MultiChild1();
		obj.difference();
		
	}
	public static void main(String args[])
	{
		MultiChild2 obj1=new MultiChild2();
	}

}
