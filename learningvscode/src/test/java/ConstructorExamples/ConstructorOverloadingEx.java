package ConstructorExamples;

public class ConstructorOverloadingEx {

    String name, email,company;
    int phn;
    double salary;


    ConstructorOverloadingEx(String name,String email,String company,int phn)
    {
        this.name=name;
        this.email=email;
        this.company=company;
        this.phn=phn;

        System.out.println(name+" "+email+" "+company+" "+phn);




    }
    ConstructorOverloadingEx(String name,String email,String company,int phn,double salary)
    {
        this.name=name;
        this.email=email;
        this.company=company;
        this.phn=phn;
        this.salary=salary;

        System.out.println(name+" "+email+" "+company+" "+phn+" "+salary);

    }


    public static void main(String args[])
    {
        ConstructorOverloadingEx coo=new ConstructorOverloadingEx("Aslam","aslam.basha1999@gmail.com","Virtusa",8090013);
        ConstructorOverloadingEx co2=new ConstructorOverloadingEx("Yashu","yashaswinikurubaa@gmail.com","Deloitte",8090014,40000.00);

        System.out.println("details of : "+coo.name);
        System.out.println("Email : " +coo.email);
        System.out.println("Company : " +coo.company);
        System.out.println("phn : " +coo.phn);
System.out.println("*****************************************************************************");
        System.out.println("details of : "+co2.name);
        System.out.println("Email : " +co2.email);
        System.out.println("Company : " +co2.company);
        System.out.println("phn : " +co2.phn);
        System.out.println("Salary : " +co2.salary);

    }
    
}
