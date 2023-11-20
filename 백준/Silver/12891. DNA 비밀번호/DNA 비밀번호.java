import java.io.*;
import java.util.*;
public class Main{
   static int check[];
    static int my[];
    static int secret;
	public static void main(String[] args) throws IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st=new StringTokenizer(br.readLine()); // 9 8
	        int n=Integer.parseInt(st.nextToken());
	        int p=Integer.parseInt(st.nextToken());
	        char arr[]=new char[n];
	        check=new int[4];
	        my=new int[4];
	        secret=0;
	        arr=br.readLine().toCharArray();
	        st=new StringTokenizer(br.readLine());
	        for(int i=0;i<4;i++){
	            check[i]=Integer.parseInt(st.nextToken());
	            if(check[i]==0)
	                secret++;
	        }
	        for(int i=0;i<p;i++) {
	        	Add(arr[i]);
	        }
	        int result=0;
	        if(secret==4)
	        	result++;
            for(int i=p;i<n;i++) {
            	int j=i-p;
            	Add(arr[i]);
            	Remove(arr[j]);
            	if(secret==4)
            		result++;
            }
            System.out.println(result);
		
	}
	private static void Remove(char c) {
		switch(c) {
		case 'A':
			if(my[0]==check[0]) 
				secret--;
			my[0]--;
			break;
		case 'C':
			if(my[1]==check[1]) 
				secret--;
			my[1]--;
			break;
		case 'G':
			if(my[2]==check[2]) 
				secret--;
			my[2]--;
			break;
		case 'T':
			if(my[3]==check[3]) 
				secret--;
			my[3]--;
			break;
			
		}
		
	}
	private static void Add(char c) {
		switch(c) {
		case 'A':
			my[0]++;
			if(my[0]==check[0]) 
				secret++;
			break;
		case 'C':
			my[1]++;
			if(my[1]==check[1]) 
				secret++;
			break;
		case 'G':
			my[2]++;
			if(my[2]==check[2]) 
				secret++;
			break;
		case 'T':
			my[3]++;
			if(my[3]==check[3]) 
				secret++;
			break;
			
		}
		
	}
}