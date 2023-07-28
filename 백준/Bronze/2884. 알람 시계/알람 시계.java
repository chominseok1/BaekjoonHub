import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int H=scan.nextInt();
        int M=scan.nextInt();
        if(H!=0)
        {
          if(M>=45)
           {
            M-=45;
          }
          else if(M<45)
            {
            H-=1;
            M=60-(45-M);
           }
        }
        else if(H==0)
        {
            if(M>=45)
           {
            M-=45;
          }
          else if(M<45)
            {
            H=23;
            M=60-(45-M);
           }
        }
        System.out.println(H+" "+M);
    }
}