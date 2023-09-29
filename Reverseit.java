import java.util.Scanner;
public class Reverseit
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String string = sc.next();
    int len = string.length();
    int i,j=0,count=0;
    char arr[] = new char[len];
    for(i=0;i<len;i++)
    {
      if(string.charAt(i) == '.')
      {
        count++;
      }
    }
    int index[] = new int[count];
    for(i=0;i<len;i++)
    {
        if(string.charAt(i) == '.')
        {
            index[j] = i;
            j++;
        }
    }
    for(i=0;i<count;i++)
    {
        System.out.println(index[i]);
    }
    int k=0;
    for(i=0;i<index.length;i++)
    {
        while(k<index[i])
        {
            if(j<arr.length)
            {
                arr[j] = string.charAt(k);
                j++;
            }
            k++;
        }  
    }
    for(i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]);
    }  
  }
}