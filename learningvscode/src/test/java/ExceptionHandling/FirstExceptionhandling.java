package ExceptionHandling;

import java.util.Scanner;

public class FirstExceptionhandling {

    public static void main(String args[]) throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value: ");
        int a =sc.nextInt();
        Thread.sleep(100);
        System.out.println("Enter b value: ");
        int b=sc.nextInt();
        int c;
        try{
            System.out.println("Try Starts");
            c=a/b;
            System.out.println("result is "+c);
            System.out.println("Try Ends");
        }catch(Exception err){
            System.out.println(err +" Exception is Occured and Handled");
        }
       
    }
    
}
