import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the input:");
		int i,j,flag;	
		int size = sc.nextInt();
		char input[] = new char[size];
		System.out.println("Enter The Input:");
		for(i=0;i<size;i++)
		{
			input[i] = sc.nextLine();	
		}
		j=size;
		while(i != size)
		{
			if(input[i] == input[j])
			{
				flag = 1;
			}
			i++;
			j--;
		}
		if(flag == 1)
		{
			System.out.println("Given Input is Palindrome");
		}
		else
		{
			System.out.println("Given Input is not a Palindrome");
		}
	}	
}