import java.util.*;
public class Triangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Lines:");
		int n = sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
				if(j==i)
				{
					for(k=1;k<=i;k++)
					{
						if(k>1)
						{
							System.out.print("*");
							System.out.print("*");
						}
						else
						{
							System.out.print("*");
						}
					}
				}
			}
			System.out.println("");
		}		
	}
}