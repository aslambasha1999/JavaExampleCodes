package OOPs;

import java.util.Scanner;


public class Cust{

    public static void main(String args[])
    {
        Withdrawl d=new Withdrawl();
        d.details();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Choose the Transaction");
        System.out.println("1. Deposit money");
        System.out.println("2. Withdrwal Amount");
        System.out.println("3. Balance Enquiry\n");



        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:d.depositBalence();
                    break;
            case 2:d.withdrawlAmt();
                    break;
            case 3: d.balenceCheck();
                    break;
            default:System.out.println("Invalid selection");
                    break;

        }
        sc.close();


        
        
    }
}

