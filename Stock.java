import java.util.Scanner;
public class Stock
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Inputs:");
        int numberOfInputs = sc.nextInt();
        int arr[] = new int[numberOfInputs];
        System.out.println("Enter The Inputs....");
        int i,j;
        int minElement=0,maxElement=0;
        for(i=0;i<numberOfInputs;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(i=0;i<numberOfInputs-1;i++)
        {
            for(j=i+1;j<numberOfInputs;j++)
            {
                if(arr[i] < arr[j])
                {
                    minElement = i;
                }
                if(arr[i] > arr[j])
                {
                    maxElement = i;
                }
            }
        }
        System.out.print("("+minElement+" "+maxElement+")");
    }
}