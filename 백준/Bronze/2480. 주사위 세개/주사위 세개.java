import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int max=a;
        //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
        //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
        //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
        if(a==b && b==c && a==c)
        {
            System.out.println(10000+a*1000);
        }
        else if(a==b && b!=c)
        {
            System.out.println(1000+a*100);
        }
        else if(b==c && b!=a)
        {
            System.out.println(1000+b*100);
        }
        else if(a==c && b!=a)
        {
            System.out.println(1000+a*100);
        }
        else if(a!=b && a!=c && b!=c)
        {
            if(max<b)
            {
               
                max=b;
                if(max<c)
                    max=c;
            }
            if(max<c)
            {
                max=c;
                if(max<b)
                    max=b;
            }
            System.out.println(max*100);
        }
    }
}