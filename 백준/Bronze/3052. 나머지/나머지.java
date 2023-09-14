import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
        int[] arr=new int[10];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int count=0;
        int count2=0;
        for(int j=0;j<arr.length;j++)
        {
            count2=0;
            for(int k=j+1;k<arr.length;k++)
            {
                if(arr[j]%42==arr[k]%42)
                    count2++;
            }
            if(count2==0)
                count++;
        }
        System.out.println(count);
    }
}