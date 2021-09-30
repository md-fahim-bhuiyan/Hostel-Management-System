package HostelManagementSystem;

public class TemporarilyStudent extends Student implements IDiscount {

    private double rentPM, rentPD, rent, foodcost;
    public double totalcost, numberOfMal, totalday;
    private int nBed;

    TemporarilyStudent(double TD, double m) {
        System.out.println("");
        System.out.println("*****Temporarily Student*****");
        totalday = TD;
        numberOfMal = m;
    }

    public void cost_of_TemporarilyStudent(int i, double k, int NB) {
        i = i;
        if (i == 1) {
            rentPD = k;
            System.out.println("" + name + " is Single bed Room student");
            rent = rentPD * totalday;
            System.out.println("Room Rent= " + rentPM);

        } else if (i == 2) {
            nBed = NB;
            rentPD = k;
            System.out.println("" + name + " is Double bed Room student");
            rent = rentPD * totalday;
            System.out.println("Room Rent= " + rent / nBed);
            rent = (rentPD * totalday) / nBed;
        }
    }

    public void cost_of_TemporarilyStudent(int i, double f)//overloaded methods
    {

        if (i == 1) {
            double melnonvegfood = f;
            System.out.println("And he is a Non-Vegetarian");
            foodcost = numberOfMal * melnonvegfood;
            System.out.println("Food Cost= " + foodcost);
        } else if (i == 2) {
            double melvegfood = f;
            System.out.println("And he is a Vegetarian");
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
        System.out.println("Discount = " + (totalcost * 0.05));
    }

    public void printcost() {
        System.out.println("Total cost After Discount= " + (totalcost * 0.95));
    }
}
