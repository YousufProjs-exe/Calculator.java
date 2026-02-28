
import java.util.Scanner;
//importing Scanner class for 
public class Fruits
{
  
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome");
        System.out.println("*You can only use for 2 numbers at a time*");
        System.out.println(" ");
        System.out.println("Lets go");
        System.out.println("Type 1 for Addition");
        System.out.println("Type 2 for Substraction");
        System.out.println("Type 3 for Multiplication");
        System.out.println("Type 4 for Division");
        System.out.println("Type 5 for Modules Division");
        
        int a = in.nextInt();
        
        System.out.println("Enter your Numbers");
        
        float b = in.nextFloat();
        float c = in.nextFloat();
        
        if(a==1)
        System.out.println(b+c);
        if(a==2)
        System.out.println(b-c);
        if(a==3)
        System.out.println(b*c);
        if(a==4)
        System.out.println(b/c);
        if(a==5)
        System.out.println(b%c);
        
        System.out.print("is Your Answer");
    }
}
