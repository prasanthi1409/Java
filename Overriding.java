class Parent
{
	public void call()
	{
		System.out.println("435678910");
	}

}
class Child extends Parent
{
	public void call()
	{
		System.out.println("0987654432");
	}

}
class T 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.call();
	}
}
