import java.util.Scanner;
class Majority
{
  public static void main(String args[])
  {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Inputs:");
    	int numberOfInputs = sc.nextInt();
    	int arr[] = new int[numberOfInputs];
    	int i,j,limit = numberOfInputs/2;
    	int count=0,temp=0;
        System.out.println("Enter The Inputs.....");
    	for(i=0;i<numberOfInputs;i++)
        {
          	arr[i] = sc.nextInt();
        } 
    	for(i=0;i<numberOfInputs;i++)
        {
          	for(j=i+1;j<numberOfInputs;j++)
            {	
              	if(arr[i] == arr[j])
                {	
                  	count++;
                    if(count > limit)
                    {
                        temp = i;
                    }
                }
            }
        }
        if(count == 0)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(arr[temp]);
        }
  }
}