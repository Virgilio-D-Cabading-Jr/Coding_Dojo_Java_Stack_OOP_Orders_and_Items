import java.util.ArrayList;

//  ////////////////////////////////////////////////////////////////
//  ORDER CLASS
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 1115
//  ////////////////////////////////////////////////////////////////

public class Order {
    //  //// VARIABLES /////////////////////////////////////////////
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items;

    //  //// METHODS ///////////////////////////////////////////////

     //  **** CONSTRUCTORS ******************************************
    
    public Order() {
        this.name ="John";
        this.total = 0;
        this.ready = false;
        this.items = null;
    }

    public Order(String name) {
        this.name = name;
        this.total = 0;
        this.ready = false;
        this.items = null;
    }


   //  **** SET METHODS *******************************************

    

   //  **** GET METHODS *******************************************
}
