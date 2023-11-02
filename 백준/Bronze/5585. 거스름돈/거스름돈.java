import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int answer=1000-Integer.parseInt(br.readLine()); // 거스름돈
        int sum=0; // 거스름돈 갯수
         
       int arr[]={500,100,50,10,5,1};
        for(int i=0;i<6;i++){
            sum+=answer/arr[i];
            answer=answer%arr[i];
        }
        System.out.println(sum);
    }
}