import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int king=scan.nextInt();
        int queen=scan.nextInt();
        int look=scan.nextInt();
        int bshop=scan.nextInt();
        int knight=scan.nextInt();
        int phone=scan.nextInt();
        // 킹:1 퀸:1 룩:2 비숍:2 나이트:2 폰:8
        System.out.print(1-king+" ");
        System.out.print(1-queen+" ");
        System.out.print(2-look+" ");
        System.out.print(2-bshop+" ");
        System.out.print(2-knight+" ");
        System.out.print(8-phone);
    }
}