package polymorphism;

public class PolyChild extends PolyParent{
	
	public PolyChild()
	{
		super();
	}
	public void calculate(int a,int b)
	{
		super.calculate(2, 3);
		int diff=a-b;
		System.out.println("Difference:"+" "+diff);
	}

	public static void main(String[] args) {
		PolyChild obj=new PolyChild();
		obj.calculate(7, 3);
		
		

	}

}
