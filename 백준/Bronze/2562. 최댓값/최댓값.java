import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[9];
        for(int i=0;i<9;i++)
        {
            arr[i]=scan.nextInt();
        }
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
           if(max<=arr[i])
           {
               max=arr[i];
               index=i;
           }
        }
        System.out.println(max);
        System.out.println(index+1);
        
    }
}