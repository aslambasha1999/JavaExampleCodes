package Methods;

public class ConstructorExamples {

    String name;
    int age;
    String gender;
    static int marks;


public ConstructorExamples()
{
    this("Yashu", "Female"); 
}
public ConstructorExamples(String name, String gender)
{
    this.name=name;
    this.gender=gender;
    
    
}

    public static void main(String args[])
    {
        
        System.out.println("Details of saba from main method: "); 
        ConstructorExamples cs=new ConstructorExamples("saba","female");
        System.out.println(cs.name);
        System.out.println(cs.gender);
        
       

    }

    
}
