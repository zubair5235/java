import java.util.Scanner;
public class MedianOfSubArrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Inputs For Array 1:");
        int numberOfInputsForArrayOne = sc.nextInt();
        System.out.println("Enter The Number of Inputs For Array 2:");
        int numberOfInputsForArrayTwo = sc.nextInt();
        int arr1[] = new int[numberOfInputsForArrayOne];
        int arr2[] = new int[numberOfInputsForArrayTwo];
        int arr3[] = new int[numberOfInputsForArrayOne+numberOfInputsForArrayTwo];
        int i,j,temp;
        int medianIndex;
        double median;
        /* int k = numberOfInputsForArrayOne-1; */
        System.out.println("Enter The Inputs For Array 1");
        for(i=0;i<numberOfInputsForArrayOne;i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter The Inputs For Array 2:");
        for(i=0;i<numberOfInputsForArrayTwo;i++)
        {
            arr2[i] = sc.nextInt();
        }
        //sorting the arrays
        /* for(i=0;i<numberOfInputsForArrayOne;i++)
        {
            for(j=i+1;j<numberOfInputsForArrayOne;j++)
            {
                if(arr1[i] > arr1[j])
                {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(i=0;i<numberOfInputsForArrayTwo;i++)
        {
            for(j=i+1;j<numberOfInputsForArrayTwo;j++)
            {
                if(arr2[i] > arr2[j])
                {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        } */
        for(i=0;i<numberOfInputsForArrayOne;i++)
        {
            arr3[i] = arr1[i];
        }
        j=0;
        for(i=numberOfInputsForArrayOne;i<numberOfInputsForArrayOne+numberOfInputsForArrayTwo;i++)
        {
            if(j<numberOfInputsForArrayTwo)
            {
                arr3[i] = arr2[j];
            }
            j++;
        }
        for(i=0;i<numberOfInputsForArrayOne+numberOfInputsForArrayTwo;i++)
        {
            for(j=i+1;j<numberOfInputsForArrayOne+numberOfInputsForArrayTwo;j++)
            {
                if(arr3[i] > arr3[j])
                {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        System.out.println("");
        for(i=0;i<numberOfInputsForArrayOne+numberOfInputsForArrayTwo;i++)            
        {
            System.out.println(arr3[i]);
        }
        if(arr3.length%2==0)
        {
            medianIndex = (arr3.length-1)/2;
            median = arr3[medianIndex]+arr3[medianIndex+1];
            System.out.println(median/2);
        }
        else
        {
            medianIndex = (arr3.length-1)/2;
            median = arr3[medianIndex];
            System.out.println(median);
        }          
    }  
}
