package Encapsulation;
import java.util.*;

public class PageUser {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username: ");
        Login l1=new Login();
        l1.setUsername(sc.nextLine());
        System.out.println(l1.getUsername());
        if(l1.getUsername().equals("Please enter Password!!"))
        {
        System.out.println("Enter Password: ");
        l1.setPwd(sc.nextLine());
        System.out.println(l1.getPwd());
        }
        sc.close();
    }
    
}
