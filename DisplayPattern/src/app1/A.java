package app1;

public class A
{
	public static void main(String[] args) {
		
		int size=5;
		for(int i=1; i<=size; i++)
		{
			for(int j=1; j<size+i; j++)
				if(j<=size-i)
					System.out.print("  ");
				else
					System.out.print(2*i-1+" ");
			System.out.println();
		}
	}

}
