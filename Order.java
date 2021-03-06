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
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.total = 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    //  **** SET METHODS *******************************************

    public void setName (String name) {
        this.name = name;
    }

    public void setReady (boolean ready) {
        this.ready = ready;
    }

    //  **** ADD METHODS *******************************************

    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

    //  **** GET METHODS *******************************************

    public String getName() {
        return this.name;
    }

    public double getTotal() {
        return this.total;
    }

    public boolean getReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public String getOrder() {
        String output = "";
        output += "Order || name: " + this.name + " | order ready: " + this.ready + " | total price: $" + String.format("%.2f", this.total) + "\n";
        output += "Items in order: ";
        for (int i=0; i<this.items.size(); i++) {
            output += this.items.get(i).getName();
            if (i < (this.items.size()-1) ) {
                output += ", ";
            }
        }
        return output;
    }

}
