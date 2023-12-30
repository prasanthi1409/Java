import java.util.Scanner;
class Leapyear 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int year = scn.nextInt();
		if(year%100!=0)
			else{
				System.out.println("Not a leap year");
			}
			if(year%4==0)
				else{
					System.out.println("leap year");
			}
					if(year%400==0){
						System.out.println("leap year");
				}
				else{
					System.out.println("Not a leap year");
			}
		   
		
		
		



	}
}
