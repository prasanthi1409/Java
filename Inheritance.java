class A
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B(int i)
	{
		i=10;
		System.out.println("B(10)");
	}
}

class T1 
{
	public static void main(String[] args) 
	{
	   	B b=new B(5);
		
	}
}
