import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int count=0;
        int num=0;
        for(int j=n-1;j>=0;j--){
            if(arr[j]>num){
                num=arr[j];
                count++;
            }
        }
        System.out.println(count);
    }
}