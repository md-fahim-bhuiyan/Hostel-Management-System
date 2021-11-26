package Admin;

public abstract class Admin {

    public String name, adminId, age, performance, shift;
    public double salary;

    public void setinformation(String N, String I, String A, String P, String S) {
        name = N;
        adminId = I;
        age = A;
        performance = P;
        shift = S;
    }

    public void printInformation() {
        System.out.println("Name = " + name);
        System.out.println("Admin Id = " + adminId);
        System.out.println("Age = " + age);
        System.out.println("Performance = " + performance);
        System.out.println("Shift = " + shift);
    }

    public void getHealthInsurance()//Override without Interface
    {
        System.out.println("Health Insurance = " + salary * 0.05);
    }

    public abstract void MonitorActivitis();

}
