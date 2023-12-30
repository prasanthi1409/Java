import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =scn.nextInt();
		boolean flag=true;
		if(n<=1){
			flag=false;
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					flag=false;
					break;
				}
				if(flag) system.out.println("prime number");
				else{
					system.out.println("not a prime number");
				}
			}
		}
		
					

	}
}
