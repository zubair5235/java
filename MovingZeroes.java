import java.util.Scanner;
public class MovingZeroes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Inputs:");
		int numberOfInputs = sc.nextInt();
		int arr[] = new int[numberOfInputs];
		int i,j,temp;
		System.out.println("Enter The Inputs:");
		for(i=0;i<numberOfInputs;i++)
		{
			arr[i] = sc.nextInt();
		}
		j = 0;
		int k = numberOfInputs-1;
		while(j < numberOfInputs)
		{
			if(arr[j] == 0)
			{
				temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
				k--;
				j++;
			}
			else
			{
				break;
			}
		}	
		System.out.println("------Output------");
		for(j=0;j<numberOfInputs;j++)
		{
			System.out.println(arr[j]);
		}
	}
}