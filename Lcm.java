import java.util.Scanner;
class LCM
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a 2 nums: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int n = a>b?a:b;
		while(true)
		{
			if(n%a==0 && n%b==0) break;
			n++;
		}
		System.out.println("LCM of "+a+" & "+b+ "=" +n);
	}
}
