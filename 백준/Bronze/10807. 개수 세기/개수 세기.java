import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //입력값 받아요
        int N=Integer.parseInt(br.readLine()); // 첫 줄 받기 첫줄은 배열의 크기
        int[] arr=new int[N]; // 배열 선언 
        String str=br.readLine(); // 배열의 들어갈 숫자들 ex)1 2 3 4 5 6 7 두번째 줄 받기
        StringTokenizer st=new StringTokenizer(str); // 배열의 들어갈 숫자들 자르기=> 
        //st는 기본이 공백으로 자름
        int v=Integer.parseInt(br.readLine()); // 찾을 숫자 !
        int count=0; // 찾을 숫자의 갯수
        // 배열에다가 넣기
        for(int i=0;i<N;i++){
        arr[i]=Integer.parseInt(st.nextToken()); //배열에다가 숫자 다넣었음
        }
        // 숫자 세기
        for(int a:arr) //배열의 값들을 a에다가 박을거임
        {
            if(a==v)
                count++; // 넣는 값이 찾을 숫자와 같으면 갯수 올림
        }
        System.out.println(count);
    }
}