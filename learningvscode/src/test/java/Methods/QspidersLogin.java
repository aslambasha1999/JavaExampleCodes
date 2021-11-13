package Methods;

import java.util.Scanner;

public class QspidersLogin {
    

    public static boolean login(String username,String password)
    {
        if(username=="admin@gmail.com" && password=="admin@123")
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String username=sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();

        boolean status=login(username, password);

        if(status==true)
        {
        System.out.println("Login successful");    
        }
        else{
            System.out.println("Invalid Username or Password");
        }

        sc.close();


    }
}
