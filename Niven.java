import java.util.Scanner;
class Niven
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();
		int sum=0,temp=num;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		if(temp%sum==0) System.out.println("Niven number");
		else System.out.println("Not a Niven number");
	}
}