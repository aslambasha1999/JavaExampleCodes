package TestCases;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();

        int mul=0;
        int temp=num;
        if(num<0)
        {
            System.out.println("Enter valid Input");
        }
        else{
                while(num!=0)
                {
                    int rem=num%10;
                    mul=mul+(rem*rem*rem);
                    num=num/10;
                }
                if(temp==mul)
                {
                    System.out.println(temp +" is an Armstrong Number");
                }
                else{
                System.out.println(temp +" is not an Armstrong Number");
        
                }
            }
                sc.close();


    }
    
}
