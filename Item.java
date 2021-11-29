//  ////////////////////////////////////////////////////////////////
//  ITEM CLASS
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 1115
//  ////////////////////////////////////////////////////////////////

public class Item {
    //  //// VARIABLES /////////////////////////////////////////////
    String name;
    double price;

    //  //// METHODS ///////////////////////////////////////////////

    //  **** CONSTRUCTORS ******************************************
    
    public Item() {
         this.name = "none";
         this.price = 0;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


    //  **** SET METHODS *******************************************

    public void setName (String name) {
        this.name = name;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    //  **** GET METHODS *******************************************

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}