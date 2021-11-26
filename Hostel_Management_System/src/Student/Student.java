package Student;

public class Student {

  public  String name, sId, age, cgpa;

   public void setInformation(String N, String I, String A, String CG) {
        name = N;
        sId = I;
        age = A;
        cgpa = CG;
    }

  public  void printinformation() {
        System.out.println("Student's Name = " + name);
        System.out.println("Id = " + sId);
        System.out.println("Age = " + age);
        System.out.println("CGPA = " + cgpa);
    }
    
}
