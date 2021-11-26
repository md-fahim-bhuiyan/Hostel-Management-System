package Employee;

import HostelManagementSystem.IBonus;

public class Supervisor extends Employee implements IBonus {

    private String status;
    public String workhour;

    public   Supervisor(String Wh) {
        System.out.println("");
        System.out.println("*****Supervisor*****");
        workhour = Wh;
    }

   public void worktimeSupervisor() {
        System.out.println("Working Time= " + workhour + " Hours");
    }

   public void CheckStudentDetails(String S) {
        status = S;
        switch (status) {
            case "Fine":
                System.out.println("All Students are Fine");
                break;
            case "Ok":
                System.out.println("All Students are Ok");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    @Override
    public void get_EidAlFitr_Bonus() {
        System.out.println("Bonus of Eid Al Fitr= " + (salary * 0.40));
    }

    @Override
    public void get_EidAlAdha_Bonus() {
        System.out.println("Bonus of Eid Al Fitr= " + (salary * 0.35));
    }

}
