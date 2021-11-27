package Encapsulation;

import java.util.Scanner;

public class Demo1 {

    private  String name;

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        Demo1 dobject=new Demo1();
        System.out.println("Enter Name: ");
        dobject.setName(sc.nextLine());
        System.out.println("Encapsulated member name is : "+dobject.getName());

        sc.close();
        
    }

    
    
}
