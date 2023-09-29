import java.util.Scanner;
public class AllPalindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String:");
        String str = sc.nextLine();
        int len = str.length();
        int i,j,k,l,m;
        for(i=0;i<len;i++)
        {
            k = i;
            for(j=len-1;j>i;j--)
            {
                l = j;
                while(k<len)
                {
                    while(l>k)
                    {
                        if(str.charAt(k) == str.charAt(l))
                        {
                            m = k;
                            while(m <= l)
                            {
                                if(m<l)
                                {
                                    System.out.print(str.charAt(m));
                                }
                                else
                                {
                                    System.out.println(str.charAt(m));
                                }
                                m++;
                            }
                            break;
                        }
                        l--;   
                    }
                    k++;
                }
            }
        }
    }
}