import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int P=Integer.parseInt(st.nextToken());
        String s=br.readLine();
        int arr[]=new int[N];
        st=new StringTokenizer(s);
        for(int i=0;i<N;i++){
            
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int arr2[]=new int[N];
        int index=0;
        for(int i=N-1;i>=0;i--){
            arr2[index]=arr[i];
            index++;
        }
        System.out.println(arr2[P-1]);
    }
}