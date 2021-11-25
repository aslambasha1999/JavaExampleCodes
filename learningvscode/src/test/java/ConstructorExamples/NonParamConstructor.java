package ConstructorExamples;

public class NonParamConstructor {

    String name;
    String company;
    static int empcode;

     NonParamConstructor()
    {
        name="Aslam";
        company="Virtusa";

    }
    
    public static void main(String args[])
    {
        NonParamConstructor no=new NonParamConstructor();

        empcode=8090013;
        System.out.println(no.name + "  emplyee Id is "+empcode +" and company name  is :"+no.company );

        NonParamConstructor npc=new NonParamConstructor();
        empcode=8090014;
        System.out.println(npc.name + "  emplyee Id is "+empcode +" and company name  is :"+npc.company );

        
    }
    
}
