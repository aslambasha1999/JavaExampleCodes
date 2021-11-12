package TestCases;
import java.util.Scanner;



public class PrimeNumbers {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range=sc.nextInt();

        for(int i=0;i<=range;i++)
        {
            if(i%2==0)
            {
               System.out.println(i); 
            }
            
        }
        sc.close();

        
    }


    
}
