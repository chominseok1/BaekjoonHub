import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[30];
        int n=0;
        
        for(int i=0;i<28;i++)
        {
            n=Integer.parseInt(br.readLine());
            arr[n-1]=n;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
                System.out.println(j+1);
        }
    }
}