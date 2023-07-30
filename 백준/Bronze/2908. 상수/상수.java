import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String num1=scan.next(); // ex> 437
        String num2=scan.next(); // ex> 743
        String s1="";
        String s2="";
      for(int i=num1.length()-1;i>=0;i--)
      {
          s1+=(char)num1.charAt(i);
          s2+=(char)num2.charAt(i);
      }
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        if(n1>n2)
        {
            System.out.println(n1);
        }
        else
        {
            System.out.println(n2);
        }
    }
}