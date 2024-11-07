import java.io.*;
import java.util.*;
class TryCatch6
{
    public static void main(String args[])
    {
        int a=5,b=0,c;
        int arr[]=new int[5];
        String str=null;
        try
        {
            c=a/b;
            arr[10]=200;
            System.out.println("The length of the string is "+str.length());
            throw new IOException();
        }
        catch(NullPointerException np)
        {
            System.out.println("NullPointerException caught");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception caught");
        }
        catch(ArrayIndexOutOfBoundsException x)
        {
            System.out.println("Array Index Out POf Bounds Exception caught ");
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}
