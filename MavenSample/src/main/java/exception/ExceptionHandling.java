package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
		int a=6;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		finally
		{
			int a1=6;
			int b1=4;
			int sum=a1+b1;
			System.out.println("Sum:"+" "+sum);
		}

	}

}
