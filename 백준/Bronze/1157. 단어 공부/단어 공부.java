import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        str=str.toUpperCase();
        int arr[] = new int[26]; // 알파벳 갯수는 26개다.  => 배열의 각 인덱스 0으로 초기화되어있음
        for(int i=0;i<str.length();i++)
        {
          char c=str.charAt(i);
          arr[c-'A']++; // ==> Counting Sort => ex) c:A-'A'=0번째 인덱스++ => 1 
        }
        int max=0; // => 최대값
        char ch='?'; // => 출력
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                ch=(char)(i+65);
            }
            else if(max==arr[i])
            {
                ch='?';
            }
        }
        System.out.println(ch);
    }
}