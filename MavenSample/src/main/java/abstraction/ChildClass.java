package abstraction;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		ParentClass obj=new ChildClass();
		obj.show();
		obj.display();
		

	}

	@Override
	public void show() {
		System.out.println("My name is:");
		
	}

	

}
