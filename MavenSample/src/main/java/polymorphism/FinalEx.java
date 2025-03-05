package polymorphism;

public final class FinalEx {
	
	public final void display(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		
		FinalEx obj=new FinalEx();
		obj.display(3, 5);
	}

}
