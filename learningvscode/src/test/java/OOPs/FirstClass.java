package OOPs;

public class FirstClass {

    long accNo;
    int IFSCCode;
    static float accountBlnc;
    static String userName;

    public void getbalance()
    {
        accNo=42349008;
        System.out.println(accNo);
        System.out.println(accountBlnc); 

    }
    public static float balenceCheck()
    {
        accountBlnc=899.08f;
        return accountBlnc;
        
    }
    

    public static void main(String args[])
    {
        FirstClass fc=new FirstClass();
        fc.IFSCCode=5496;
        fc.accNo=24919418;
        fc.getbalance();

        accountBlnc=980.95f;
        userName="Aslam";
        System.out.println("account balence of "+userName+" with "+fc.accNo+ " is "+accountBlnc);
        FirstClass.balenceCheck();
        FirstClass.balenceCheck();
        balenceCheck();
    }

    
}
