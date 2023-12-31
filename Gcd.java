import java.util.Scanner;
class GCD 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a 2 nums: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int n = a<b?a:b;
		while(true)
		{
			if(a%n==0 && b%n==0){
				break;
			}
			n--;
			
		}
		System.out.println("GCD of "+a+" & "+b+ "=" +n);
	}
}