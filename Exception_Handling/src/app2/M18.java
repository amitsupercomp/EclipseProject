package app2;

public class M18 
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int i = 10 / 0;
			System.out.println(2);
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println(3);
			int j = 10 / 0;
			System.out.println(4);
		}
		finally
		{
			System.out.println(5);
		}
		System.out.println("main end");
		
	}

}
