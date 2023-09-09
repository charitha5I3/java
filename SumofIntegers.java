import java.io.*;
import java.util.*;
public class SumofIntergers extends Object
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers for addition ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x+y;
        System.out.println("Sum of " + x + " and " + y + " is " +z);
    }
}