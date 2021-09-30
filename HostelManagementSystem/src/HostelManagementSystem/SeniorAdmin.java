package HostelManagementSystem;

public class SeniorAdmin extends Admin implements IBonus {

   public String timeOfExprince;

    SeniorAdmin(String TE, double S) {
        System.out.println("");
        System.out.println("*****Senior Admin*****");
        timeOfExprince = TE;
        salary = S;
    }

    public void printSeniorAdminEx()
    {
        System.out.println("Exprince = " + timeOfExprince);
    }
    public void printSeniorAdminSalary() {
        System.out.println("Salary = " + salary);
    }

    @Override
    public void get_EidAlFitr_Bonus() {
        System.out.println("Bonus of Eid Al Fitr= " +(salary*0.1));    }

    @Override
    public void get_EidAlAdha_Bonus() {
        System.out.println("Bonus of Eid Al Adha= " +(salary*0.075));
    }

    @Override
    void MonitorActivitis() {
        System.out.println("Senior Admin monitors activities on Hostel Management System development");
    }

}

