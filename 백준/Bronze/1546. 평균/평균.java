import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String ss=br.readLine();
		StringTokenizer st=new StringTokenizer(ss);
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int max=0;
		for(int num:arr)
		{
			if(max<num)
				max=num;
		}
		
		double score=0;
		double avg=0;
		for(int i=0;i<N;i++) {
			score+=(double)arr[i];
		}
		avg=score/max*100/N;
		System.out.println(avg);
		
    }
}