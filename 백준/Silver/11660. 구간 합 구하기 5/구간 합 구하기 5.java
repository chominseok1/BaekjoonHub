import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int r=Integer.parseInt(st.nextToken());
        int arr[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
          
        }
        int s[][]=new int[n+1][n+1];
        //[1][1]~[1][5] 까지 합
        for(int i=1;i<=1;i++) {
        	for(int j=1;j<=n;j++) {
        		s[i][j]=s[i][j-1]+arr[i][j];
        		
        	}
        	
        }
        //[1][1]~[5][1] 까지 합
        for(int j=1;j<=1;j++) {
        	for(int i=1;i<=n;i++) {
        		s[i][j]=s[i-1][j]+arr[i][j];
        		
        	}
        	
        }
        //[2][2]~[5][5]까지
        for(int i=2;i<=n;i++) {
        	for(int j=2;j<=n;j++) {
        		s[i][j]=s[i][j-1]+s[i-1][j]-s[i-1][j-1]+arr[i][j];
        		
        	}
        }
        for(int i=0;i<r;i++) {
        	st=new StringTokenizer(br.readLine());
        	int x1=Integer.parseInt(st.nextToken()); //2
        	int y1=Integer.parseInt(st.nextToken()); //3
        	int x2=Integer.parseInt(st.nextToken()); //2
        	int y2=Integer.parseInt(st.nextToken()); //4
        	System.out.println(s[x2][y2]-s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1]);
        }
    }
}