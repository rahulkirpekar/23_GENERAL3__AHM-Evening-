package oops.polytopic.runtime;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice = sc.nextInt();
		
		switch (choice) 
		{
					// Polymorphic object--->Upcasting
			case 1: vehicle = new TwVehicle();
					vehicle.getSpec();
					
					// Downcasting
					TwVehicle twObj = (TwVehicle)vehicle;
					twObj.getTwInfo();
					break;
					
			case 2: vehicle = new LmvVehicle();
					vehicle.getSpec();

					// Downcasting
					LmvVehicle lmvObj = (LmvVehicle)vehicle;
					lmvObj.getLmvInfo();
					break;
					
			case 3: vehicle = new HmvVehicle();
					vehicle.getSpec();

					// Downcasting
					HmvVehicle hmvObj = (HmvVehicle)vehicle;
					hmvObj.getHmvInfo();
					break;
		}
	}
}
