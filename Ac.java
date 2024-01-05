class AC 
{
	int temp;
	AC()
	{
		temp=21;
	}
	AC(int t)
	{
		temp=t;
	}
	public void displayTemperature()
	{
		System.out.println("display temperature:"+temp);
	}
}
class AirConditioner
{
	public static void main(String[] args)
	{
		AC a1=new AC();
		a1.displayTemperature();
		AC a2=new AC(19);
		a2.displayTemperature();
	}
}



