import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double all=0.0; // 몇학점인지 다 더하기
		double total=0.0; // 총 점수
		String hak="";
		for(int i=0;i<20;i++)
		{
			String st=br.readLine();
			StringTokenizer stz=new StringTokenizer(st);
			stz.nextToken(); // 과목명 날라감
			double d=Double.parseDouble(stz.nextToken()); // 3.0
			
			hak=stz.nextToken(); // A+
			if(hak.equals("A+"))
			{
				total+=(d*4.5);
			}
			else if(hak.equals("A0"))
			{
				total+=(d*4.0);
			}
			else if(hak.equals("B+"))
			{
				total+=(d*3.5);
			}
			else if(hak.equals("B0"))
			{
				total+=(d*3.0);
			}
			else if(hak.equals("C+"))
			{
				total+=(d*2.5);
			}
			else if(hak.equals("C0"))
			{
				total+=(d*2.0);
			}
			else if(hak.equals("D+"))
			{
				total+=(d*1.5);
			}
			else if(hak.equals("D0"))
			{
				total+=(d*1.0);
			}
			else if(hak.equals("F"))
			{
				total+=(d*0.0);
			}
			else if(hak.equals("P"))
			{
				continue;
			}
			all+=d;
		}
		double avg=(total/all);
		System.out.println(avg);
    }
}