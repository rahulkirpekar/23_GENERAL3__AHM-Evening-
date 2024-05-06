package oops.abstopic.interfacetopic.runtime;

public class LmvVehicle implements Vehicle
{
	public void getSpec() 
	{
		System.out.println("LmvVehicle : getSpec()");
	}
	public void getLmvInfo() 
	{
		System.out.println("LmvVehicle : getLmvInfo()");
	}
	@Override
	public void test1() 
	{
		System.out.println("LmvVehicle : test1()");		
	}
	@Override
	public void test2() 
	{
		System.out.println("LmvVehicle : test2()");		
	}
}
