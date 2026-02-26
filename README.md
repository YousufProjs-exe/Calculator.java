# Calculator.java
Simple Java Calculator - Two Number Arithmetic Operations  A lightweight, user-friendly calculator application built in Java that performs arithmetic operations on two numbers with instant results. Features a clean interface for easy input and clear output display. Perfect for learning Java fundamentals, and object-oriented programming concepts.

Simple Java Calculator - Two Number Arithmetic Operations
A lightweight, user-friendly calculator application built in Java that performs basic arithmetic operations on two numbers. Supports addition, subtraction, multiplication, and division with instant results. Features a clean interface for easy input and clear output display. Perfect for learning Java fundamentals, GUI implementation, and event handling. Ideal for beginners exploring object-oriented programming concepts.

This description:
✅ Clearly states it's a Java calculator
✅ Mentions it's for two numbers
✅ Specifies arithmetic operations (addition, subtraction, multiplication, division)
✅ Highlights key features (user-friendly, clean interface)
✅ Mentions educational value


import java.util.Scanner;

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
