import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(); // 처음 숫자
        int b=scan.nextInt();// 두번째 숫자
        System.out.println(a*(b%10));
        System.out.println(a*((b/10)%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}