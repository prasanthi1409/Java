class Auto 
{
	public static int length(int num)
	{
		int length=0,temp=num;
		int sqrNum=num*num;
		int d=1;
		while(num>0);
		{
			length=length+1;
			num/=10;
		}
		return num;
	}
	public static int main(int num)
	{
		for(int i=1;i<=num;i++)
		{
			int d=d*10;
		}
		
	}
	public static void main(String[] args) 
	{
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Num: ");
		int num=scn.nextInt();
		if(num<0) System.out.println("No negatives");
		int result=sqrNum%d(num);
		if(temp==result) System.out.println("Automarpic");
		else System.out.println("Not an Automarpic");
	}
}
