import java.util.*;
class Tempconversion
{
	public static void CelciusToFahrenheit()
	{
		Scanner sc = new Scanner(System.in);
		double input;
		System.out.println("Enter The Input:\n");
		input = sc.nextDouble();
		double result = (input*1.8)+32;
		System.out.println("Fahrenheit:"+result);
	}
	public static void FahrenheitToCelcius()
	{
		Scanner sc = new Scanner(System.in);
		double input;
		System.out.println("Enter The Input:\n");
		input = sc.nextDouble();
		double result = (input-32)*5/9;
		System.out.println("Celcius:"+result);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Choice:\n1.Celcius to Fahrenheit\n2.Fahrenheit To Celcius\n");
		int choice;
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				CelciusToFahrenheit();
			break;
			case 2:
				FahrenheitToCelcius();
			break;
			default:
				System.out.println("\tEnter The Correct Input\t");
			break;
		}
	}
}