import java.util.Scanner;
class Primerange
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the range:");
	int n=s.nextInt();
	int count=0;
    boolean flag;
    for(int i=n;i>=1;i--)
    {
    	if(i<2)
    		continue;
    	flag=true;
    	for(int j=2;j<=i/2;j++)
    	{
    		if(i%j==0)
    		{
    			flag=false;
    			break;
    		}
    	}
    	if(flag)
    	{
    		count++;
    		System.out.print(i+"\t");
    	}		
	}
	System.out.print("count="+count);
  }
}
