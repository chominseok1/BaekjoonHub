import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        
        if(B+C>=60)
        {
            A=(A+((B+C)/60))%24;
            B=(B+C)%60;
        }   
        else
        {
            B+=C;
        }
        System.out.println(A+" "+B);
    }
}