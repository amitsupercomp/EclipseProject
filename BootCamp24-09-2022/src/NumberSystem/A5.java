package NumberSystem;

public class A5 
{
	public static void main(String[] args) {
		
		int n=100,count=0;
		boolean primeChk;
		while(count<20)
		{
			primeChk=true;
			for(int j=2; j<=n/2; j++)
				if(n%j==0)
				{
					primeChk=false;
					break;
				}
			if(primeChk)
			{
				System.out.println(n);
				count++;
			}
			n++;
		}
	}

}
