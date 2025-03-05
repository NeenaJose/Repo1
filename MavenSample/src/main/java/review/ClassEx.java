package review;

public class ClassEx implements InterfaceEx{

	public static void main(String[] args) {
		InterfaceEx obj=new ClassEx();
		obj.display();
		

	}

	@Override
	public void display() {
		System.out.println("Name:Neena");
		System.out.println("Age:20");
		
	}

}
