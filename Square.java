import java.util.*;
public class Square
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter The Number of Lines:");
		int n = sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}