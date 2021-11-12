package TestCases;

import java.util.Scanner;

public class ReverseDigits{

    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num=sc.nextInt();
        int rem=0;
        int rev=0;
        int temp=num;
        if(num<0)
        {
            System.out.println("Enter valid Input");
        }
        else{
            for(int i=0;i<=num;i++)
            {
                
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;

            }
            System.out.println("The reverse of a numberis :  "+rev);

     }
     if(temp==rev)
     {
         System.out.println(temp +" is a palindrome");
     }
     else{
        System.out.println(temp +" is not a palindrome");

     }
     sc.close();
        
    }
    
}
