import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
         int arr[]= new int[3];
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st=new StringTokenizer(br.readLine());
     for(int i=0;i<3;i++){
         
         arr[i]=Integer.parseInt(st.nextToken());
     }
     Arrays.sort(arr);
     if(arr[2]<arr[0]+arr[1])
         System.out.println(arr[0]+arr[1]+arr[2]);
     else{
         System.out.println(arr[0]+arr[1]+(arr[0]+arr[1]-1));
     }
    }
}