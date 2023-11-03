import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[9]; // 9명
        int sum=0;
        int fake1=0;
        int fake2=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            sum+=arr[i];
        }
        //////////////////////////////////////////////////
        Arrays.sort(arr);
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(sum-arr[i]-arr[j]==100){
                   fake1=arr[i];
                   fake2=arr[j];
                }
            }
        }
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]==fake1||arr[i]==fake2){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}