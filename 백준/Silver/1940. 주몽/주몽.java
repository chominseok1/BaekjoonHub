import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine()); // 갑옷 갯수
        int m=Integer.parseInt(br.readLine()); // 갑옷의 합;
        int arr[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken()); // 갑옷 받기
        }
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j){
            if(arr[i]+arr[j]==m){
                count++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>m){
                j--;
            }
            else {
                i++;
            }
        }
        System.out.println(count);
    }
}