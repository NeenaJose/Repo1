package aggregation;

public class ChildClass{
	
	ParentClass ref;
	public ChildClass(ParentClass ref)
	{
		this.ref=ref;
		String place="Kottayam";
		System.out.println(place);
		System.out.println(ref.age);
		

	}

	public static void main(String[] args) {
		ParentClass obj=new ParentClass();
		ChildClass obj1=new ChildClass(obj);

	}

}
