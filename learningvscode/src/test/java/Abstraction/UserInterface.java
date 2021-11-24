package Abstraction;


abstract class Calculator
{
abstract public void add(int i,int j);
abstract public void sub(int i, int j);
abstract public void mul(int i,int j);
abstract public void div(int i, int j);
}
 
class Operations extends Calculator{

    @Override
    public void add(int i, int j) {
        
        System.out.println(i+j);
    }

    @Override
    public void sub(int i, int j) {
        System.out.println(i-j);
    }

    @Override
    public void mul(int i, int j) {
       System.out.println(i*j);
        
    }

    @Override
    public void div(int i, int j) {
        
        System.out.println(i/j);
    }
    
}

public class UserInterface {

    public static void main(String args[])
    {
        Operations op=new Operations();
        op.add(1, 2);
        op.sub(3, 2);
        op.mul(5, 3);
        op.div(4,2);
    }


    
}
