package Abstraction;

abstract class MoterCycle{
    abstract public void price();
    abstract public void design();
    abstract public void brand();
}
class Details extends MoterCycle
{

    @Override
    public void price() {
        System.out.println("Price is $1500");
        
    }

    @Override
    public void design() {
        System.out.println("Design is Enfield 500 watt");
        
    }

    @Override
    public void brand() {
        System.out.println("Brand is Royal Enfield");
        
    }

}
public class VehiclesInterface {

    public static void main(String args[]) {
        
        Details rf=new Details();
        rf.brand();
        rf.design();
        rf.price();
        
        
        
    }
    
}
