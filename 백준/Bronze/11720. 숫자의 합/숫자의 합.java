import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        char arr[]=new char[n];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i]-'0';
        }
        System.out.println(sum);
    }
}