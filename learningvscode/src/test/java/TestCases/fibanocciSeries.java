package TestCases;

import java.util.Scanner;

public class fibanocciSeries {

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    int range=sc.nextInt();
    int first=0;
    int second=1;
    System.out.print(first+" "+second+" ");
    for(int i=0;i<range;i++)
    {
        int next=first+second;
        first=second;
        second=next;
        System.out.print(next+" ");

    }
sc.close();    
}
}
