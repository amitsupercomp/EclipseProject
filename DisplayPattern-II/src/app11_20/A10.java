package app11_20;

public class A10 {
	
	public static void main(String[] args) {
		
		for(int i=1, l=6; i<=l; i++)
		{
			for(int j=1,n=6-i; j<=l; j++)
				if(i==1 || i==l || j==1 || j==l)
					System.out.print("0 ");
				else if(n==1)
						System.out.print(n+" ");
				else
					System.out.print(n--+" ");
			System.out.println();
		}
	}

}
