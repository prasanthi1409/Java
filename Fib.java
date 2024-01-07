import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a lower: ");
		int l=scn.nextInt();
		System.out.println("Enter a upper: ");
		int u=scn.nextInt();
		int a=0,b=1,c;
		if(l==0)
		System.out.println(a + "\n" +b);
		for( ; ;)
		{
			c=a+b;
			if(c>u)
			{
				break;}
			if(c>=l)
			{
				System.out.println(c);
			}
				a=b;
				b=c;
			
			//else break;
		}

	}
}
