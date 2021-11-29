import java.util.ArrayList;

//  ////////////////////////////////////////////////////////////////
//  ORDER TEST
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 1115
//  ////////////////////////////////////////////////////////////////

public class OrderTest {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("ORDER TEST APP\n");
    
        // Menu items
        Item item1 = new Item("mocha", (double) 3);
        Item item2 = new Item("latte", (double) 3.5);
        Item item3 = new Item("drip coffee", (double) 1.5);
        Item item4 = new Item("capuccino", (double) 3.75);
        
        System.out.printf("Item: %s | price: $%.2f\n", item1.getName(), item1.getPrice());
        System.out.printf("Item: %s | price: $%.2f\n", item2.getName(), item2.getPrice());
        System.out.printf("Item: %s | price: $%.2f\n", item3.getName(), item3.getPrice());
        System.out.printf("Item: %s | price: $%.2f\n", item4.getName(), item4.getPrice());
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates

        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
    
}

