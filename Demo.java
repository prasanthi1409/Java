import java.util.Scanner;
 class Demo {

	public static void main(String[] args) 
	{
		
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int n1=s.nextInt();
int a=0,b=0,c=0;
if(n1>0&&n1%2==0)
{
	a=n1+2;
	b=a+2;
	c=b+2;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
}
else if(n1<0&&n1%2!=0)
{
	a=n1-2;
	b=a-2;
	c=b-2;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
else
{
	System.out.println("Given number is odd");
}
	}

}
