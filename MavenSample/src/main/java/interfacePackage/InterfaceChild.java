package interfacePackage;

public class InterfaceChild implements ParentInterface{

	public static void main(String[] args) {
		ParentInterface obj=new InterfaceChild() ;
		obj.display();

	}

	@Override
	public void display() {
		System.out.println(name);
		System.out.println(age);
		int mark=100;
		System.out.println(mark);
				
	}

	

}
