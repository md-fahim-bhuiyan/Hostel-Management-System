package HostelManagementSystem;

import Student.PermanentStudent;
import Student.TemporarilyStudent;
import Food.Non_Veg_Food;
import Food.Veg_Food;
import Food.Food;
import Room.SingleBedRoom;
import Room.DoubleBedRoom;
import Admin.SeniorAdmin;
import Admin.JuniorAdmin;
import Employee.Supervisor;
import Employee.Manager;

public class Main {

    public static void main(String[] args) {
        System.out.println("**************Hostel Management System **************");
        SingleBedRoom SR1 = new SingleBedRoom();
        SR1.rentPerDay(350);
        SR1.rentPerMonth(5000);
        Non_Veg_Food NV1 = new Non_Veg_Food();
        NV1.CostForNonVagFood(80);
        DoubleBedRoom DB1 = new DoubleBedRoom();
        DB1.info(2);
        DB1.rentPerDay(500);
        DB1.rentPerMonth(9000);
        Veg_Food V1 = new Veg_Food();
        V1.CostForVagFood(45);

        System.out.println("\n*******Employee Details********");
        Manager ali = new Manager();
        ali.setInformation("M101", "Ali Ahamed", "35 Years", "Excellent", 100000);
        ali.printInfo();
        ali.checkingDocoment("Done");
        ali.get_EidAlFitr_Bonus();
        ali.get_EidAlAdha_Bonus();
        ali.SalaryExtandPerYear();

        Supervisor S1 = new Supervisor("10");
        S1.setInformation("SUP101", "AR Khan", "32 Year", "Ok", 50000);
        S1.printInfo();
        S1.SalaryExtandPerYear();
        S1.CheckStudentDetails("Ok");
        S1.get_EidAlFitr_Bonus();
        S1.get_EidAlAdha_Bonus();
        S1.worktimeSupervisor();

        SeniorAdmin SA1 = new SeniorAdmin("5 Years", 75000);
        SA1.setinformation("MD. Asraf Khan", "AD101", "27 Years", "Very Good", "Day");
        SA1.printInformation();
        SA1.printSeniorAdminEx();
        SA1.get_EidAlFitr_Bonus();
        SA1.get_EidAlAdha_Bonus();
        SA1.getHealthInsurance();
        SA1.MonitorActivitis();
        SA1.printSeniorAdminSalary();

        JuniorAdmin JA1 = new JuniorAdmin("1st Job", 30000);
        JA1.setinformation("Ali Ahamud", "AD102", "22 Years", "Good", "Night");
        JA1.printInformation();
        JA1.job_number();
        JA1.get_EidAlFitr_Bonus();
        JA1.get_EidAlAdha_Bonus();
        JA1.getHealthInsurance();
        JA1.MonitorActivitis();
        JA1.printJuniorAdminSalary();

        Food F = new Food();
        F.setFoodInfo("2", " Veg Food & Non-Veg Food", "Canteen", "Student's");
        F.printFoodInfo();
        NV1.Non_VagFoodManu();
        NV1.CostForNonVagFood();
        V1.VagFoodManu();
        V1.CostForVagFood();

        System.out.println("\n**********Student Details**********");
        PermanentStudent PS1 = new PermanentStudent("Good", 80);
        PS1.setInformation("Joy Khan", "S101", "19", "3.80");
        PS1.printinformation();
        PS1.cost_of_PermanentStudent(1, SR1.rentPMonth, 1);
        PS1.cost_of_PermanentStudent(1, 40, NV1.melnonvegfood);
        PS1.costCalculation();
        PS1.printcost(PS1.totalcost);
        PS1.getDiscount();
        PS1.printcost();

        TemporarilyStudent TS1 = new TemporarilyStudent(13, 30);
        TS1.setInformation("Alif Bhuiyan", "S102", "19.5", "3.85");
        TS1.printinformation();
        TS1.cost_of_TemporarilyStudent(2, DB1.rentPDay, DB1.numberOfBed);
        TS1.cost_of_TemporarilyStudent(2, V1.melvegfood);
        TS1.costCalculation();
        TS1.printcost(TS1.totalcost);
        TS1.getDiscount();
        TS1.printcost();

        TemporarilyStudent TS2 = new TemporarilyStudent(13, 30);
        TS2.setInformation("Alve Bhuiyan", "S103", "21 Years", "3.90");
        TS2.printinformation();
        TS2.cost_of_TemporarilyStudent(2, DB1.rentPDay, DB1.numberOfBed);
        TS2.cost_of_TemporarilyStudent(2, NV1.melnonvegfood);
        TS2.costCalculation();
        TS2.printcost(TS2.totalcost);
        TS2.getDiscount();
        TS2.printcost();

        System.out.println("\n*******Room Details*******");
        SR1.SingleBedRoom();
        SR1.setRoomInfo("R101", "6 X 7 Foot", "2");
        SR1.printRoomInfo();
        SR1.StudentId(SR1.roomNumber, PS1.sId);
        SR1.printSID();

        DB1.DoubleBedRoom();
        DB1.setRoomInfo("R201", "10 X 10 Foot", "3");
        DB1.printRoomInfo();
        DB1.info();
        DB1.StudentId(TS1.sId, TS2.sId, DB1.roomNumber);
        DB1.printSID();
    }

}
