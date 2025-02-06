public class ObjCreation {
   public static void main(String[] args) {
    Student s=new Student();
    s.name="Anvi";
    s.roll_no=20;
    //call the display fntn in class student
    s.display();
   }

}
 class Student
{
    String name;
    int roll_no;

   void display()
   {
    System.out.println("Name: "+name);
    System.out.println("RollNo: "+roll_no);

   }
}
