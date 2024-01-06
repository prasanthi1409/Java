import java.util.Scanner;
class  Bigger
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("num1: ");
		int a = scn.nextInt();
		System.out.print("num2: ");
		int b = scn.nextInt();
		if(a>b){
			System.out.println("a is bigger");
		}else if(b>a){
			System.out.println("b is bigger");
		}else{
			System.out.println("both are equal");
		}
	}
}
