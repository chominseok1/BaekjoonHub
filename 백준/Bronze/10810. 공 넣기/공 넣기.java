import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int M=scan.nextInt();
        int arr[]=new int[N];
        int i=0; 
        int j=0;
        int k=0;
        for(int a=0;a<M;a++)
        {
            i=scan.nextInt()-1; //배열의 인덱스는 0번부터
            j=scan.nextInt()-1; // 배열의 인덱스는 0번부터
            k=scan.nextInt(); // 공 번호
            for(int b=i;b<=j;b++)
            {
                arr[b]=k;
            }
        }
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}