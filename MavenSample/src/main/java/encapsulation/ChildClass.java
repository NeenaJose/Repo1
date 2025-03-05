package encapsulation;

public class ChildClass {
	public void display()
	{
		ParentClass obj=new ParentClass();
		obj.setPin(1000);
		int p=obj.getPin();
		if(p>1000)
		{
			System.out.println("valid pin");
		}
		else
		{
			System.out.println("Not Valid");
		}
		
	}
	
	public static void main(String args[])
	{
		ChildClass obj=new ChildClass();
		obj.display();
		
	}

}
