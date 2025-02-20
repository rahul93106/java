public class ObjCreation {
   public static void main(String[] args) {
      
       Student s = new Student();
       
       s.name = "Rahul";
       s.rollNo = 29;

       s.display();
   }
}

class Student {
   String name;
   int rollNo;


   void display() {
       System.out.println("Student Details:");
       System.out.println("Name: " + name);
       System.out.println("Roll No: " + rollNo);
   }
}
