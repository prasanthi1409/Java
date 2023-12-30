import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =scn.nextInt();
		for(int i = 2;i<=n;i++){
			if(n%i==0){
				System.out.println("Not a Prime number");
				return;
			}
			else if(n<=1){
				System.out.println("Not a prime number");
				return;
			}
			else 
			{
				System.out.println("Prime number");
		}
		}
	}
}
