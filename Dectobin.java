import java.util.Scanner;
class DecToBin 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n = scn.nextInt();
		int dec = 53;
		int bin = 0;
		int i = 1;
		while(dec>0)
		{
			int bit = dec%2;
			bin = (bit*i)+bin;
			dec/=2;
			i*=10;
		}
		System.out.println(bin);
	}
}
