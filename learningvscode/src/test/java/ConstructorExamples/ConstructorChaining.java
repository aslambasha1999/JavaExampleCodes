package ConstructorExamples;

public class ConstructorChaining {


    String name, email,company;
    int phn;
    double salary;

    ConstructorChaining()
    {
        this("Aslam","aslam.basha1999@gmail.com","Virtusa",8090013);
    }
    public  ConstructorChaining(String name,String email,String company,int phn)
    {
        this("Yashu","yashaswinikurubaa@gmail.com","Deloitte",8090014,40000.00);
        System.out.println("*****************************************************************************");

        System.out.println("details of : "+name);
        System.out.println("Email : " +email);
        System.out.println("Company : " +company);
        System.out.println("phn : " +phn);

        
    }
    public  ConstructorChaining(String name,String email,String company,int phn,double salary)
    {
        System.out.println("details of : "+name);
        System.out.println("Email : " +email);
        System.out.println("Company : " +company);
        System.out.println("phn : " +phn);
        System.out.println("Salary : " +salary);
    }





    
    public static void main(String args[])
    {
        System.out.println("main methods start");
        ConstructorChaining coc=new ConstructorChaining();
        System.out.println("main method ends");
        

    }
    
}
