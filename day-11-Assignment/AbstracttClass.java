public class AbstracttClass {
    public static void main(String[] args) {
         Child c= new Child();
         c.getData();
         C c1=new C();
         c1.getData();
    }
}
abstract class A
{
    abstract void getData();
}
class Child extends A
{
   void getData()
   {
    System.out.println("Java");
   }
}
class C extends A
{
    void getData()
    {
        System.out.println("Programming..");
    }
}