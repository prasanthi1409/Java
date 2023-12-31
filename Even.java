import java.util.Scanner;
class  EvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a num: ");
		int a = scn.nextInt();
		if(a%2==0){
			System.out.print("Even num");
		}else{
			System.out.println("Odd num");
		}
	}
}