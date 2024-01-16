import java.util.Scanner;
class Cross
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter n value:");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				int num=(1-1)*n;
			for (int j=1;j<=n ;j++ ) {
				System.out.print(++num+"\t");
			}
			}
			else
			{
				int num=(2-1)*n;
			for (int j=1;j<=n ;j++ ) {
				System.out.print(num--+"\t");
			}
	     	}
			System.out.println();
		}
	}
}