import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[] arr=new int[N];
        int i=0;
        int j=0;
        int temp=0;
        for(int a=0;a<N;a++)
        {
            arr[a]=a+1;
        }
        String ss="";
        for(int b=0;b<M;b++)
        {
            ss=br.readLine();
            StringTokenizer st2=new StringTokenizer(ss);
            i=Integer.parseInt(st2.nextToken())-1;
            j=Integer.parseInt(st2.nextToken())-1;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}