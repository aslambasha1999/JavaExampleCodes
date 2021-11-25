package ConstructorExamples;



public class ConstructorbasicExamples {

    String name;
    String company="Virtusa";
    static int empcode;

    public void method1()
    {
    System.out.println("This is non static Method1");
    }
    public static void method2()
    {
        System.out.println("This is static Method2");   
    }

    public static void main(String args[])
    {
        ConstructorbasicExamples co=new ConstructorbasicExamples();

        //name="aslam";
        co.name="aslam";

        //co.empcode=8090013;
        empcode=8090013;
        System.out.println(co.name + "  emplyee Id is "+empcode +" and company name  is :"+co.company );

        //method1();
        co.method1();

        //co.method2();
        method2();

        ConstructorbasicExamples cbe=new ConstructorbasicExamples();

        cbe.name="Yashu";

        empcode=8090014;
        System.out.println(cbe.name + "  emplyee Id is "+empcode +" and company name  is :"+cbe.company );
        

        

    }





    
}
