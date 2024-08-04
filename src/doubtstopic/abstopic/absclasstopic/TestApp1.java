package doubtstopic.abstopic.absclasstopic;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below Vehicle choice : ");
		System.out.println("1) For TwVehicle ");
		System.out.println("2) For LmvVehicle ");
		System.out.println("3) For HmvVehicle ");
		int choice = sc.nextInt();
		Vehicle vehicle = null;
		switch(choice) 
		{
			case 1: vehicle = new TwVehicle();
					vehicle.getSpec();
					break;
	
			case 2: vehicle = new LmvVehicle();
					vehicle.getSpec(); 
					break;
	
			case 3: vehicle = new HmvVehicle();
					vehicle.getSpec(); 
					break;
		}
	}
}