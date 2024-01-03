import java.util.Scanner;
class Xylem
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=scn.nextInt();
		int last=num%10,sum=0;
		num/=10;
		while(num>9)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		int res=last+num;
		if(res==sum) System.out.println("Xylem");
		else System.out.println("Pholem");
	}
}
		
