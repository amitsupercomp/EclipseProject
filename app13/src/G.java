class  G
{
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			main(args);
			System.out.println(2);
			syso
		}
		catch(StackOverflowError err)
		{
			System.out.println(3);
		}
		System.out.println("main end");
	}
}
