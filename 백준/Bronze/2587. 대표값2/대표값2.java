import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        int total=sum/5;
        System.out.println(total);
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}