package inheritance;

public class SingleChild extends SingleParent {
	public static void show()
	{
		SingleParent obj=new SingleParent();
		obj.display();
		System.out.println("Neena");
	}

	public static void main(String[] args) {
		
		show();

	}

}
