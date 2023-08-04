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
		int num=Integer.parseInt(br.readLine()); // 배열의 크기
		String s=br.readLine(); // 배열에 들어오는 숫자
		StringTokenizer st=new StringTokenizer(s); // 들어오는 숫자들을 잘라서 배열의 넣으려고 생성
		int n=Integer.parseInt(br.readLine()); // 세번째 들어오는 숫자
		int arr[]=new int[num]; //
		int index=0; // arr안에 세번째 들어오는 숫자의 갯수
		for(int i=0;i<num;i++)
		{
			
			arr[i]=Integer.parseInt(st.nextToken());
		}
		for(int count:arr)
		{
			if(count==n)
			{
				index++;
			}
		}
		System.out.println(index);
    }
}