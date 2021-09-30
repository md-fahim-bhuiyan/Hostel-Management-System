package HostelManagementSystem;

import Employee.Employee;

public class Manager extends Employee implements IBonus {

    private String Status;

    Manager() {
        System.out.println("*****Manager*****");
    }

    public void checkingDocoment(String S) {
        Status = S;
        switch (Status) {
            case "Done":
                System.out.println("Docoment is Done");
                break;
            case "ok":
                System.out.println("Docoment is ok");
                break;
            default:
                System.out.println("Docoment Is not complite");
                break;
        }
    }

    @Override
    public void get_EidAlFitr_Bonus() {
        System.out.println("Bonus of Eid Al Fitr= " + (salary * 0.75));
    }

    @Override
    public void get_EidAlAdha_Bonus() {
        System.out.println("Bonus of Eid Al Fitr= " + (salary * 0.50));
    }

    @Override
    public void SalaryExtandPerYear()//Override without Interface
    {
        System.out.println("Only Manager has 15% Salary Extand Per Year");
    }
}
