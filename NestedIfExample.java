import java.io.*;
import java.util.*;
public class NestedIfExample
{
   public static void main(String[] args)
   {
     System.out.println("Enter marks of three subjects");
     Scanner sc=new Scanner(System.in);
     int m1=sc.nextInt();
     int m2=sc.nextInt();
     int m3=sc.nextInt();
     int total=m1+m2+m3;
     float Avg=(float)total/3;
     if(Avg>=75)
     {
        if(Avg>=95)
        {
           System.out.println("your average is in top 5 percent");
        }
        else if(Avg>=90)
        {
           System.out.println("your average is in top 10 percent");
        }
        else
        {
           System.out.println("student passed in distinction");
        }
     }
     else if(Avg>=40 && Avg<75)
     {
        System.out.println("student passed");
     }
     else
     {
       System.out.println("student failed");
     }
   }
}
   