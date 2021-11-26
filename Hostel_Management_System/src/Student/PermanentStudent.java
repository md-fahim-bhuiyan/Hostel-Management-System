package Student;

import HostelManagementSystem.IDiscount;

public class PermanentStudent extends Student implements IDiscount {

    public String behave;
    private double rentPM, rentPD, numberOfMal, rent, foodcost;
    public double totalcost;
    private int nBed;

    public PermanentStudent(String b, double m) {
        System.out.println("");
        System.out.println("*****Permanent Student*****");
        behave = b;
    }

    public void cost_of_PermanentStudent(int i, double k, int NB) {

        if (i == 1) {
            rentPM = k;
            System.out.println("" + name + " is Single bed Room student");
            System.out.println("Room Rent= " + rentPM);
            rent = rentPM;
        } else if (i == 2) {
            nBed = NB;
            rentPD = k;
            System.out.println("" + name + " is Double bed Room student");
            System.out.println("Room Rent= " + rentPD / nBed);
            rent = rentPD / nBed;
        }
    }

    public void cost_of_PermanentStudent(int i, double m, double f)//overloaded methods
    {

        if (i == 1) {
            numberOfMal = m;
            double melnonvegfood = f;
            System.out.println("And he is a Non-Vegetarian");
            numberOfMal = m;
            foodcost = numberOfMal * melnonvegfood;
            System.out.println("Food Cost= " + foodcost);
        } else if (i == 2) {
            numberOfMal = m;
            double melvegfood = f;
            System.out.println("And he is a Vegetarian");
            numberOfMal = m;
            foodcost = numberOfMal * melvegfood;
            System.out.println("Food Cost= " + foodcost);
        }
    }

    public void costCalculation() {
        totalcost = rent + foodcost;
    }

    public void printcost(double i)//overloaded methods
    {
        totalcost = i;
        System.out.println("Total cost= " + (totalcost));
    }

    @Override
    public void getDiscount() {
        System.out.println("Discount= " + (totalcost * 0.1));
    }

    public void printcost() {
        System.out.println("Total cost after discount= " + (totalcost * 0.9));
    }
}
