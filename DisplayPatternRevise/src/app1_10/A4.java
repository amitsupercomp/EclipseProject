package app1_10;

public class A4 {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5; i++)
		{
			for(int j=1; j<=6; j++)
				if(j==2)
					System.out.print("  ");
				else
				System.out.print((char)(i+64)+" ");
			System.out.println();
		}
	}
}
