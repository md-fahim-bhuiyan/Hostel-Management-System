package HostelManagementSystem;
public class Food {
            
  private  String food_Item,category,sell,orderBy;
    public void setFoodInfo(String fI,String C, String S,String O)
    {
        food_Item =fI;
        category=C;
        sell=S;
        orderBy=O;
    }
    public void printFoodInfo()
    {
        System.out.println("");
        System.out.println("********Food Details********");
        System.out.println("Number Of Food Item= "+food_Item);
        System.out.println("Category= "+category);
        System.out.println("Sell On= "+sell);
        System.out.println("Order By= "+orderBy);
    }
}
