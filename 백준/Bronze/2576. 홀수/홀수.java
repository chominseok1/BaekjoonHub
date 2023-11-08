import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int min=100;
        int num=0;
        int count=0;
        for(int i=0;i<7;i++){
            num=Integer.parseInt(br.readLine());
            if(num%2!=0){
                sum+=num;
                count++;
                if(min>num){
                    min=num;
                }
            }
           
        }
        if(count==0)
            System.out.println(-1);
        else{
        System.out.println(sum);
        System.out.println(min);
        }
    }
}