import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[][]=new int[9][9];
        int max=-1;
        int index=0;
        int index2=0;
            for(int i=0;i<9;i++)
            {
                StringTokenizer st=new StringTokenizer(br.readLine());
                for(int j=0;j<9;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                    if(max<arr[i][j])
                    {
                        max=arr[i][j];
                        index=i+1;
                        index2=j+1;
                    }
                    
                    
                }
            }
        System.out.println(max);
        System.out.print(index+" "+index2);
    }
}