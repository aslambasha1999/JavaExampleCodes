package OOPs;

import java.util.Scanner;



public class Bank {

    String accNo="918142349008";
    String accountHolderName="Aslam Basha";
    double availableBalence=23056;
    public void details()
    {
        System.out.println("Account Holder: "+accountHolderName+"\n"+"Account Number : "+accNo);
    }
    
}
class Deposit extends Bank
{
    Scanner sc=new Scanner(System.in);

    public void depositBalence()
    {   
        System.out.println("Available Balence  : "+availableBalence );
        System.out.println("Enter the Deposit amount: ");
        double depositAmt=sc.nextDouble();
        availableBalence+=depositAmt;
        System.out.println("The Available balance after deposit :"+availableBalence);
    }
}

class Withdrawl extends Deposit
{
    
    public void withdrawlAmt()
    {
        System.out.println("Available Balence  : "+availableBalence );
        System.out.println("Enter the Withdrawl Amount: ");
        double withdrawAmt=sc.nextDouble();
        if(withdrawAmt>availableBalence)
        {
            System.out.println("Insufficient Funds");
        }
        else{
        availableBalence-=withdrawAmt;
        System.out.println("The Available balance after Withdrawl :"+availableBalence);
        }
    }
    public void balenceCheck()
    {
        System.out.println("Available Balence  : "+availableBalence );
    }
}
