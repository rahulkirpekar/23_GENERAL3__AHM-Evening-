package oops.abstopic.interfacetopic.runtime;

public class HmvVehicle implements Vehicle
{
	public void getSpec() 
	{
		System.out.println("HmvVehicle : getSpec()");
	}
	public void getHmvInfo() 
	{
		System.out.println("HmvVehicle : getHmvInfo()");
	}
	@Override
	public void test1() 
	{
		System.out.println("HmvVehicle : test1()");
	}
	@Override
	public void test2() 
	{
		System.out.println("HmvVehicle : test2()");		
	}
}
