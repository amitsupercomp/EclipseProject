package NumberSystem;

import java.util.Scanner;

public class A4 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a  first number");
		int n1=sc.nextInt();
		System.out.println("Enter a  second number");
		int n2=sc.nextInt();
		boolean primeChk;
		while(n1<=n2)
		{
			primeChk=true;
			for(int j=2; j<=n1/2; j++)
				if(n1%j==0)
				{
					primeChk=false;
					break;
				}
			if(primeChk)
				System.out.println(n1);
			n1++;
		}
	}

}
