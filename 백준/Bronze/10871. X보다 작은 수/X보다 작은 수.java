import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ss=br.readLine();
		StringTokenizer st=new StringTokenizer(ss);
		int N=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		int arr[]=new int[N];
		String num=br.readLine();
		StringTokenizer st2=new StringTokenizer(num);
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(st2.nextToken());
			if(arr[i]<X)
			{
				System.out.print(arr[i]+" ");
			}
		}
    }
}