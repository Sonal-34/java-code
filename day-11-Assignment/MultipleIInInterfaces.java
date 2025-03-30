public class MultipleIInInterfaces {
 public static void main(String[] args) {
    Car c=new Car("Tesla");
    c.drive();
    c.reFuel();
 }  
}
interface Drivable
{
    void drive();
}
interface Fuelable
{
   void reFuel();
}
class Car implements Drivable,Fuelable
{
    String model;
    public Car(String model)
    {
        this.model=model;
    }
    public void drive()
    {
        System.out.println("The " + model + " is ready to drive!!");
    }
    public void reFuel()
    {
        System.out.println("The " + model + " is being refuled, ready to drive!!");
    }
} 
