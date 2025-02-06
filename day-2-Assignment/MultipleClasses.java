public class MultipleClasses {
    public static void main(String[] args) {
        //obj for student clas
        Student s1=new Student();
        s1.name="Anvi";
        s1.roll_no=20;

        //obj for course class
        Course c1=new Course();
        c1.cname="Java";
        c1.c_id=101;
        s1.display();
        c1.displayInfo();

        
    }
   static class Student
    {
      String name;
      int roll_no;
      void display()
      {
        System.out.println("Name: "+name);
        System.out.println("RollNo: "+roll_no);
      }
    }
    static class Course
    {
        String cname;
        int c_id;
        void displayInfo()
        {
            System.out.println("Course Name: "+cname);
            System.out.println("Course Id: "+c_id);

        }
    }
}
