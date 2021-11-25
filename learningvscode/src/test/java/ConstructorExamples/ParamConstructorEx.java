package ConstructorExamples;

public class ParamConstructorEx {

    String name;
    String company;
    static int empcode;

    ParamConstructorEx(String name,String company )
    {
        this.name=name;
        this.company=company;

        System.out.println(this.name + " " + this.company);


    }

    public static void main(String args[])
    {
        ParamConstructorEx pco=new ParamConstructorEx("Aslam", "Virtusa");
        ParamConstructorEx pc2=new ParamConstructorEx("Yashu", "Deloitte");

        empcode=8090013;
        System.out.println(pco.name + "  emplyee Id is "+empcode +" and company name  is :"+pco.company );

        empcode=8090014;
        System.out.println(pc2.name + "  emplyee Id is "+empcode +" and company name  is :"+pc2.company );



    }
    
}
