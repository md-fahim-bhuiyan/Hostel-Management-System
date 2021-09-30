package Employee;
public class Employee {
public String eId,Name,Age,performance;
public double salary;
public void setInformation(String I, String N, String A,String P,double S)
{
    eId=I;
    Name=N;
    Age=A;
    performance =P;
    salary =S;
}

public void printInfo()
{
    System.out.println("ID = " + eId);
    System.out.println("Name = " + Name);
    System.out.println("Age = " + Age);
    System.out.println("Performance = " + performance);
    System.out.println("Salary= " + salary);
}

public void SalaryExtandPerYear() //Override without Interface
{
    System.out.println("All Empolyee has 10% Salary Extand Per Year");
}
}
