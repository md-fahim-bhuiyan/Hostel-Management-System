package HostelManagementSystem;

public class JuniorAdmin extends Admin implements IBonus {

    public String numberOfJob;

    JuniorAdmin(String NJ, double S) {
        System.out.println("");
        System.out.println("*****Junior Admin*****");
        numberOfJob = NJ;
        salary = S;
    }

    @Override //Override without Interface
    public void getHealthInsurance() {
        System.out.println("Health Insurance= " + (salary * 0.035));
    }

    public void job_number() {
        System.out.println("Number of Job= " + numberOfJob);
    }

    public void printJuniorAdminSalary() {
        System.out.println("Salary = " + salary);
    }

    @Override
    public void get_EidAlFitr_Bonus() {
        System.out.println("Bonus of Eid Al Fitr= " + (salary * 0.075));
    }

    @Override
    public void get_EidAlAdha_Bonus() {
        System.out.println("Bonus of Eid Al Adha= " + (salary * 0.05));
    }

    @Override
    void MonitorActivitis() {
        System.out.println("Junior Admin monitors activities on website development");
    }
}
