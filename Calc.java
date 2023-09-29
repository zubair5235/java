import java.util.*;
class Calc
{

	public static void add()
	{
		Scanner sc = new Scanner(System.in);
		int noi;
		System.out.println("Enter The Number Of Inputs:");
		noi = sc.nextInt();
		float input;
		float sum = 0;
		System.out.println("Enter The Values:");
		for(int i=0;i<noi;i++)
		{
			input = sc.nextFloat();
			sum += input;
			System.out.println("The Addition Result is:"+sum);
		}	
	}	

	public static void sub()
	{
		Scanner sc = new Scanner(System.in);
		int noi;
		System.out.println("Enter The Number Of Inputs:");
		noi = sc.nextInt();
		float input;
		float sub;
		System.out.println("Enter The Values:");
		input = sc.nextFloat();
		sub = input;
		for(int i=1;i<noi;i++)
		{
			input = sc.nextFloat();
			sub -= input;
			System.out.println("The Subraction Result:"+sub);
		}
	}

	public static void mul()
	{
		Scanner sc = new Scanner(System.in);
		int noi;
		System.out.println("Enter The Number Of Inputs:");
		noi = sc.nextInt();
		float input;
		float mul=1;
		System.out.println("Enter The Values:");
		for(int i=0;i<noi;i++)
		{
			input = sc.nextFloat();
			mul *= input;
			System.out.println("The Subraction Result:"+mul);
		}
	}

	public static void div()
	{
		Scanner sc = new Scanner(System.in);
		int noi;
		System.out.println("Enter The Number Of Inputs:");
		noi = sc.nextInt();
		float input;
		float div;
		System.out.println("Enter The Values:");
		input = sc.nextFloat();
		div = input;
		for(int i=1;i<noi;i++)
		{
			input = sc.nextFloat();
			div /= input;
			System.out.println("The Subraction Result:"+div);
		}
	}

	public static void power()
	{
		Scanner sc = new Scanner(System.in);
		double x,y,res;
		System.out.println("Enter The Values:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		res = Math.pow(x,y);
		System.out.println("The Result is:"+res);
	}

	public static void mod()
	{
		Scanner sc = new Scanner(System.in);
		int x,y,res;
		System.out.println("Enter The Values:");
		x = sc.nextInt();
		y = sc.nextInt();
		res = x%y;
		System.out.println("The Result is:"+res);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int choice;
		boolean flag = true;
		while(flag)
		{
			System.out.println("Select The Operation:\n1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Power\n6.Mod\n7.Exit\n");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				add();
				break;
		
				case 2:
				sub();
				break;
			
				case 3:
				mul();
				break;
			
				case 4:
				div();
				break;
			
				case 5:
				power();
				break;

				case 6:
				mod();
				break;

				case 7:
				flag = false;
				break;
	
				default:
				System.out.println("Invalid Selection\nPlease Choose The Appropriate Operation.");
				break;
			}
		}
	}
}