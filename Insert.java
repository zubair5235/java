import java.util.Scanner;
public class Insert
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Inputs:");
        int numberOfInputs = sc.nextInt();
        int arr[] = new int[numberOfInputs];
        System.out.println("Enter The Array Elements...");
        int i,target,temp,j;
        for(i=0;i<numberOfInputs;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorting The Array...");
        for(i=0;i<=10;i++)
        {
            if(i==10)
            {
                System.out.println('.');   
            }
            else
            {
                System.out.print('.');
            }
        }
        for(i=0;i<numberOfInputs;i++)
        {
            for(j=i+1;j<numberOfInputs;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Printing The Sorted Array...");
        for(i=0;i<numberOfInputs;i++)
        {
            if(i == numberOfInputs-1)
            {
                System.out.println(arr[i]);
            }
            else
            {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println("Enter The Target To Insert...");
        target = sc.nextInt();
        for(i=0;i<numberOfInputs;i++)
        {
            if(arr[i] > target)
            {
                System.out.println(i);
                break;
            }
        }
    }
}