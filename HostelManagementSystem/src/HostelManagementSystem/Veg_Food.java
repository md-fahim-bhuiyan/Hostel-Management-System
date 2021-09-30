package HostelManagementSystem;

public class Veg_Food extends Food {

    public double melvegfood;

    public void VagFoodManu() {
        System.out.println("");
        System.out.println("*****Non-Veg Food Manu*****");
        System.out.println("Item:\n1.Tea \t2.Rice \t3. Oats \t4.Paraha \t5.Allu Gohi \t6.Roti \t7. Carrots");
    }

    public void CostForVagFood(double me) {
        melvegfood = me;
    }

    public void CostForVagFood()//overloaded methods
    {
        System.out.println("Cost of " + melvegfood + " BDT per mel Veg Food");
    }
}
