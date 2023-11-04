import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        // 0 111 도 0101 개 0001 걸 0000 윷 1111 모 
        //       A       B       C      D       E
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[4];
        int count=0;
        for(int i=0;i<3;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<arr.length;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            for(int k=0;k<arr.length;k++){
                if(arr[k]==1)
                    count++;
            }
            if(count==1)
                System.out.println("C");
            else if(count==2)
                System.out.println("B");
            else if(count==3)
                System.out.println("A");
            else if(count==4)
                System.out.println("E");
            else
                System.out.println("D");
            count=0;
        }
    }
}