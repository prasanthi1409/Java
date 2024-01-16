import java.util.Scanner;
class Reverse
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter n the value:");
		int n=scn.nextInt();
		int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==a){
			System.out.println("it is a palindrome:");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}