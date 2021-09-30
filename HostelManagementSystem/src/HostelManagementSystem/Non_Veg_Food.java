package HostelManagementSystem;

public class Non_Veg_Food extends Food {

    public double melnonvegfood;

    public void Non_VagFoodManu() {
        System.out.println("");
        System.out.println("*****Veg Food Manu*****");
        System.out.println("Item:\n1.Chicken Biryani \t2.Chicken Nihari \t3. Chicken Manchorian \t4.Paraha \t5.Allu Gohi \t6.Roti\t7.Mutton Korma");
    }

    public void CostForNonVagFood(double me) {
        melnonvegfood = me;
    }

    public void CostForNonVagFood()//overloaded methods
    {
        System.out.println("Cost of " + melnonvegfood + " BDT per mel Non Veg Food");
    }

}
