import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringTokenizer st=new StringTokenizer(s);
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int temp=0;
        ////////////////////////////////////////// 첫줄
        int[] arr=new int[N];
        for(int a=0;a<N;a++){
          arr[a]=a+1;  
        }
        String ss="";
        for(int b=0;b<M;b++){
            ss=br.readLine();
            StringTokenizer st2=new StringTokenizer(ss);
            int i=Integer.parseInt(st2.nextToken())-1; //배열의 인덱스는 0번부터
            int j=Integer.parseInt(st2.nextToken())-1; // 배열의 인덱스는 0번부터
         for(int c=i;c<=j;c++){
             temp=arr[c];
             arr[c]=arr[j];
             arr[j]=temp;
             j--;
         }
            
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}